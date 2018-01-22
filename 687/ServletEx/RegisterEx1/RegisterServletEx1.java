/**
 * RegisterServlet
 */
package com.java.servlet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.postgresql.util.PSQLException;

/**
 * Radhika
 *
 * Entity User
 */
	class User{
		private String userName;
		private String userDOB;
		private String userGender;
		private String userPicLoc;
		private String userProf;
		private String userEmailID;
		private String userPwd;
		/**
		 * 
		 */
		public User() {
			super();
			this.userName = null;
			this.userDOB = null;
			this.userGender = null;
			this.userPicLoc = null;
			this.userProf = null;
			this.userEmailID = null;
			this.userPwd = null;
		}
		/**
		 * @param userName
		 * @param userGender
		 * @param userPicLoc
		 * @param userProf
		 * @param userEmailID
		 * @param userPwd
		 * @param userDOB
		 */
		public User(String userName, String userDOB, String userGender, String userPicLoc, String userProf, String userEmailID,
				String userPwd) {
			super();
			this.userName = userName;
			this.userDOB = userDOB;
			this.userGender = userGender;
			this.userPicLoc = userPicLoc;
			this.userProf = userProf;
			this.userEmailID = userEmailID;
			this.userPwd = userPwd;
		}
		/**
		 * @return the userName
		 */
		public String getUserName() {
			return userName;
		}
		/**
		 * @param userName the userName to set
		 */
		public void setUserName(String userName) {
			this.userName = userName;
		}
		/**
		 * @return the userDOB
		 */
		public String getUserDOB() {
			return userDOB;
		}
		/**
		 * @param userDOB the userDOB to set
		 */
		public void setUserDOB(String userDOB) {
			this.userDOB = userDOB;
		}

		/**
		 * @return the userGender
		 */
		public String getUserGender() {
			return userGender;
		}
		/**
		 * @param userGender the userGender to set
		 */
		public void setUserGender(String userGender) {
			this.userGender = userGender;
		}
		/**
		 * @return the userPicLoc
		 */
		public String getUserPicLoc() {
			return userPicLoc;
		}
		/**
		 * @param userPicLoc the userPicLoc to set
		 */
		public void setUserPicLoc(String userPicLoc) {
			this.userPicLoc = userPicLoc;
		}
		/**
		 * @return the userProf
		 */
		public String getUserProf() {
			return userProf;
		}
		/**
		 * @param userProf the userProf to set
		 */
		public void setUserProf(String userProf) {
			this.userProf = userProf;
		}
		/**
		 * @return the userEmailID
		 */
		public String getUserEmailID() {
			return userEmailID;
		}
		/**
		 * @param userEmailID the userEmailID to set
		 */
		public void setUserEmailID(String userEmailID) {
			this.userEmailID = userEmailID;
		}
		/**
		 * @return the userPwd
		 */
		public String getUserPwd() {
			return userPwd;
		}
		/**
		 * @param userPwd the userPwd to set
		 */
		public void setUserPwd(String userPwd) {
			this.userPwd = userPwd;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((userEmailID == null) ? 0 : userEmailID.hashCode());
			return result;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			if (userEmailID == null) {
				if (other.userEmailID != null)
					return false;
			} else if (!userEmailID.equals(other.userEmailID))
				return false;
			return true;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "User [userName=" + userName + ", userDOB=" + userDOB + ", userGender=" + userGender
					+ ", userPicLoc=" + userPicLoc + ", userProf=" + userProf + ", userEmailID=" + userEmailID
					+ ", userPwd=" + userPwd + "]";
		}
	}
	
	// User defined exceptions

	@SuppressWarnings("serial")
	class UserNameDuplicatedException extends Exception{
	  /**
		 * 
		 */
	    private String errorMessage;
	    
		/**
		 * @param errorMessage
		 */
		public UserNameDuplicatedException (String errorMessage) {
			super();
			this.errorMessage = errorMessage;
		}

		/**
		 * @return the errorMessage
		 */
		public String getErrorMessage() {
			return errorMessage;
		}
	  
	}

	// interface for Register User
		interface IRegisterUserServiceProvider{
			 public boolean createUser(User usr) throws UserNameDuplicatedException,PSQLException,SQLException; 
		}
		
	// write a separate connection class which consumes the properties file 
		class DBConnector {

			private Properties connectionProperties = new Properties();

			public Connection getConnection() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException
			{
				connectionProperties.load(new FileInputStream("C:\\Java\\JDBC\\ConnectionFile.properties.txt"));
				Class.forName(connectionProperties.getProperty("driver"));
				Connection connection = DriverManager.getConnection(
				connectionProperties.getProperty("url"),
				connectionProperties.getProperty("username"), 
				connectionProperties.getProperty("password"));

				return connection;
		      	 
		    }
		}	
		class MatrimonyRegisterUser implements IRegisterUserServiceProvider 
		{
			Connection con;
			public MatrimonyRegisterUser (Connection con) {
				super();
				this.con = con;
			}
			
		      public boolean createUser(User usr) throws UserNameDuplicatedException,PSQLException,SQLException {
		    	 
		    	CallableStatement statement=con.prepareCall("{call registeruser(?,?,?,?,?,?,?)}");
				statement.setString(1, usr.getUserName());
				statement.setString(2, usr.getUserDOB());
				statement.setString(3, usr.getUserGender().substring(1, 1));
				statement.setString(4, usr.getUserPicLoc());
				statement.setString(5, usr.getUserProf());
				statement.setString(6, usr.getUserEmailID());
				statement.setString(7, usr.getUserPwd());
				int insertCount=statement.executeUpdate();// actual execution happens 
				if(insertCount==0)		
					return true;
				throw new UserNameDuplicatedException ("User Name Duplicate!!!");
		      }
		}
		
	@WebServlet("/Register")
	public class RegisterServletEx1 extends HttpServlet {
		private static final long serialVersionUID = 1L;
	    
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
			
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {

			try {
					DBConnector dbc = new DBConnector();
					Connection conn = dbc.getConnection();
					
					response.setContentType("text/html");  
					PrintWriter out = response.getWriter();  
	  			
					IRegisterUserServiceProvider irsp = new MatrimonyRegisterUser(conn);
				
					String personName = request.getParameter("userName");
					String DOB = request.getParameter("userDOB");
					String gender=request.getParameter("userGender");
					String picsLocation=request.getParameter("userPicLoc");
					String profession=request.getParameter("userProf");
					String email=request.getParameter("userEmail");
					String password=request.getParameter("userPass");
		        
					User usr = new User (personName,DOB,gender,picsLocation,profession,email,password);

					if (irsp.createUser(usr)) {
						out.println("Registered successfully!!!");
						System.out.println("User Registered successfully");
					}
					
					conn.close();
				}
			catch(UserNameDuplicatedException UNDE) {
				System.out.println("In UserNameDuplicatedException");
			}
			catch(PSQLException PSE) {
				System.out.println("In SQL Exception");
				System.out.println(PSE.getSQLState());
				PSE.printStackTrace();
			}
			catch(SQLException SE) {
				System.out.println("In SQL Exception");
				System.out.println(SE.getSQLState());
				SE.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
    }
