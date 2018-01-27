package com.java.servlet;

/**
 * Login Servlet
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.postgresql.util.PSQLException;

/**
 * Radhika
 *
 */

	// User defined exceptions

	@SuppressWarnings("serial")
	class InvalidCredentialsException extends Exception{
	  /**
		 * 
		 */
	    private String errorMessage;
	    
		/**
		 * @param errorMessage
		 */
		public InvalidCredentialsException (String errorMessage) {
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
		
	@WebServlet("/LoginServlet")
	public class LoginServletEx2 extends HttpServlet {
		private static final long serialVersionUID = 1L;
	    
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
			
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {

			try {
					System.out.println("In Servlet Right place???");
					DBConnector dbc = new DBConnector();
					Connection conn = dbc.getConnection();
					
					response.setContentType("text/html");  
					PrintWriter out = response.getWriter();  
	  			
					IRegisterUserServiceProvider irsp = new MatrimonyServiceProvider (conn);
				
					String personName = request.getParameter("userName");
					String password=request.getParameter("userPass");
					System.out.println(personName);
					System.out.println(password);

					if (irsp.authenticateUser(personName,password )) {
						out.println("Welcome " + personName + "!!!");
						System.out.println("Welcome " + personName + "!!!");
					}
					else {
						out.println("Invalid Credentials");
						System.out.println("Invalid Credentials");
					}
					
					conn.close();
				}
			catch(InvalidCredentialsException ICE) {
				System.out.println("In InvalidCredentialsException");
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
