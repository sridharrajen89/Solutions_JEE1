/**
 * 
 */
package com.java.sql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.postgresql.util.PSQLException;

/**
 * Radhika
 *
 * Sample Employee JDBC connectivity to Postgres
 * Exceptions are not handled.
 */
	class Employee{
		private int employeeNumber;
		private String employeeName;
		private double employeeSalary;
		//Constructors

		public Employee() {
			super();
			this.employeeNumber = 0;
			this.employeeName = null;
			this.employeeSalary = 0;
		}
		/**
		 * @param employeeNumber
		 * @param employeeName
		 * @param employeeSalary
		 */
		public Employee(int employeeNumber, String employeeName, double employeeSalary) {
			super();
			this.employeeNumber = employeeNumber;
			this.employeeName = employeeName;
			this.employeeSalary = employeeSalary;
		}
		/**
		 * @return the employeeNumber
		 */
		public int getEmployeeNumber() {
			return employeeNumber;
		}
		/**
		 * @param employeeNumber the employeeNumber to set
		 */
		public void setEmployeeNumber(int employeeNumber) {
			this.employeeNumber = employeeNumber;
		}
		/**
		 * @return the employeeName
		 */
		public String getEmployeeName() {
			return employeeName;
		}
		/**
		 * @param employeeName the employeeName to set
		 */
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		/**
		 * @return the employeeSalary
		 */
		public double getEmployeeSalary() {
			return employeeSalary;
		}
		/**
		 * @param employeeSalary the employeeSalary to set
		 */
		public void setEmployeeSalary(double employeeSalary) {
			this.employeeSalary = employeeSalary;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + employeeNumber;
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
			Employee other = (Employee) obj;
			if (employeeNumber != other.employeeNumber)
				return false;
			return true;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSalary="
					+ employeeSalary + "]";
		}

	}
	
	// User defined exceptions

	@SuppressWarnings("serial")
	class EmployeeNotFoundException extends Exception{
	  /**
		 * 
		 */
	    private String errorMessage;
	    
		/**
		 * @param errorMessage
		 */
		public EmployeeNotFoundException(String errorMessage) {
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

	class DuplicateEmployeeIDException extends Exception{
	  /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	    final String ERRORMESSAGE="Duplicate Employee Id, Consider new Id";
		/**
		 * @return the ERRORMESSAGE
		 */
		public String getERRORMESSAGE() {
			return ERRORMESSAGE;
		}
	    
	}

	// interface for CRUD operation
		interface IEmployeeServiceProvider{
		     public boolean  insertRecord(Employee emp) throws PSQLException,SQLException; // throws DuplicateEmployeeIDException;
		     public Employee readRecord(int empId) throws EmployeeNotFoundException, SQLException;
		     public boolean  updateRecord(int empId, double empSalary) throws EmployeeNotFoundException, SQLException;
		     public boolean  deleteRecord(int empId) throws EmployeeNotFoundException, SQLException;
		}
		
	// write a separate connection class which consumes the properties file 
		class DBConnector {

			private Properties connectionProperties = new Properties();

			public Connection getConnection() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException
			{
				connectionProperties.load(new FileInputStream("C:\\Java\\ConnectionFile.properties.txt"));
				Class.forName(connectionProperties.getProperty("driver"));
				Connection connection = DriverManager.getConnection(
				connectionProperties.getProperty("url"),
				connectionProperties.getProperty("username"), 
				connectionProperties.getProperty("password"));

				return connection;
		      	 
		    }
		}	
		class EmployeeDBCRUD implements IEmployeeServiceProvider 
		{
			Connection con;
			public EmployeeDBCRUD(Connection con) {
				super();
				this.con = con;
			}
			
		      public boolean insertRecord(Employee emp) throws PSQLException,SQLException{
		        boolean result1=false;
				int empNo = emp.getEmployeeNumber();
		        String empName = emp.getEmployeeName();
		        Double empSalary = emp.getEmployeeSalary();
				
				CallableStatement statement=con.prepareCall("{call insertRecord(?,?,?)}");
				statement.setInt(1, empNo);
				statement.setString(2, empName);
				statement.setDouble(3, empSalary);
				int insertCount=statement.executeUpdate();// actual execution happens 
				System.out.println(insertCount);
				if(insertCount==0)		
					result1=true;
				return result1;
		      }
		      
		      public boolean  updateRecord(int empId, double empSalary) throws SQLException, EmployeeNotFoundException{
		          CallableStatement statement=con.prepareCall("{call updateRecord(?,?)}");
				  statement.setInt(1, empId);
				  statement.setDouble(2, empSalary);
		          int updateCount=statement.executeUpdate();
				  if(updateCount==0)		
					return true;
				  return false;
		      }		      
		      
		      public boolean  deleteRecord(int empId) throws SQLException, EmployeeNotFoundException{
		          CallableStatement statement=con.prepareCall("{call deleteRecord(?)}");
				  statement.setInt(1, empId);
		          int deleteCount=statement.executeUpdate();
		          System.out.println(deleteCount);
				  if(deleteCount==0)		
					return true;
				  return false;
		      }		      

		      public Employee readRecord(int empId) throws EmployeeNotFoundException, SQLException{
		          CallableStatement statement=con.prepareCall("{call readRecord(?)}");
		          statement.setInt(1,empId);
		          int empNo;
		          String empName;
		          Double empSalary;
		          ResultSet rs=statement.executeQuery(); // execute the stored procedure  
		         while(rs.next()) {
		             empNo=rs.getInt(1);
		             if (empNo == empId) {
		            	 empName=rs.getString(2).trim();
		                 empSalary=rs.getDouble(3);
		                 return new Employee(empId,empName,empSalary);
		             }
		          }
		          throw new EmployeeNotFoundException("Employee Not Found"); 
		          
		         
		       }
		}
	public class TestEmployeeDB {
		public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
			System.out.println("basic CRUD operation on Employee Table"); 
			
			DBConnector dbc = new DBConnector();
			Connection conn = dbc.getConnection();
    		Employee emp = new Employee (10,"Matt H",6000);
  			EmployeeDBCRUD empCRUD = new EmployeeDBCRUD(conn);
			if (empCRUD.insertRecord(emp))
				System.out.println("Employee Record inserted successfully");
			
			try {
				System.out.println(empCRUD.readRecord(1));
				System.out.println(empCRUD.updateRecord(6, 7750));
				System.out.println(empCRUD.deleteRecord(10));
				System.out.println(empCRUD.deleteRecord(7));
			}
			catch(EmployeeNotFoundException ENFE) {
				System.out.println("In EmployeeNotFoundException");
			}
			catch(PSQLException SE) {
				System.out.println("In SQL Exception");
			}
			finally {
				conn.close();
			}
		}
}
