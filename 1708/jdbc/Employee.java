package com.htc.CoreJavaExercise3;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class Employee {
	private int employeeNumber;
	  private String employeeName;
	  private double employeeSalary;
	  
	  // Default Constructors
	  public Employee() {
			super();
			this.employeeNumber = 0;
			this.employeeName = "";
			this.employeeSalary = 0.00;
		}
	  //Constructors 
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
	  
	  //getter/ setter 
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
	  //hashcode , equals
	
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
		return "employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	  //toString
	}

	@SuppressWarnings("serial")
	
	class DuplicateEmployeeException extends Exception{
		
		private String errorMessage;
	 	
	 	public DuplicateEmployeeException(String errorMessage) {
	 		this.errorMessage = errorMessage;
	 	}
	 	
	 	public String getErrorMessage( ) {
	 		return errorMessage;
	 	}
		
	}
	@SuppressWarnings("serial")
	class EmployeeNotFindException extends Exception{
		
		private String errorMessage;
	 	
	 	public EmployeeNotFindException(String errorMessage) {
	 		this.errorMessage = errorMessage;
	 	}
	 	
	 	public String getErrorMessage( ) {
	 		return errorMessage;
	 	}
		
	}
/*	class EmployeeNotFoundException extends Exception {
	
	    private String errorMessage;


		public Exception DuplicateEmployeeException;
	    
		
		public EmployeeNotFoundException(String errorMessage) {
			super();
			this.errorMessage = errorMessage;
		}

		
		public String getErrorMessage() {
			return errorMessage;
		}

	class DuplicateEmployeeException extends Exception{
		final String ERRORMESSAGE="Duplicate Employee exist!!!";
		
		public String getERRORMESSAGE() {
			return ERRORMESSAGE;
		}	
	}*/

	interface IEmployeeServiceProvider{
	      public boolean  insertRecord(Employee emp) throws DuplicateEmployeeException, SQLException;
	      public Employee readRecord(int empid) throws EmployeeNotFindException,SQLException ;
	      public boolean  updateRecord(int empid,double empsalary) throws EmployeeNotFindException,SQLException;
	      public boolean  deleteRecord(int empid) throws SQLException,EmployeeNotFindException;
	}

	// write a separate connection class which consumes the properties file 
			class DBConnector {

				private Properties connectionProperties = new Properties();

				public Connection getConnection() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException
				{
		//			connectionProperties.load(new FileInputStream("Connection1.properties"));
					connectionProperties.load(DBConnector.class.getClassLoader().getResourceAsStream("ConnectionFile1.properties"));
					Class.forName(connectionProperties.getProperty("driver"));
					Connection connection = DriverManager.getConnection(
					connectionProperties.getProperty("url"),
					connectionProperties.getProperty("username"), 
					connectionProperties.getProperty("password"));

					return connection;
			      	 
			    }
			}	

	class HTCGlobalServices implements IEmployeeServiceProvider{
		Connection con;
		public HTCGlobalServices (Connection Con) {
			super();
			this.con = con;
		}
		@Override
	      public boolean  insertRecord(Employee emp) throws DuplicateEmployeeException,SQLException{
	                boolean result1=false;
			int empid=emp.getEmployeeNumber();
			String empname=emp.getEmployeeName();
			double empsalary=emp.getEmployeeSalary();
	                // similarly for name and salary 
			
			CallableStatement statement=con.prepareCall("{call insertRecord(?,?,?)}");
			statement.setInt(1,empid);
			statement.setString(2, empname);
			statement.setDouble(3, empsalary);
			int insertCount=statement.executeUpdate();// actual execution happens 
			System.out.println(insertCount);
			if(insertCount==0)		
				result1=true;
	//		return results1;
			return result1;
	      
	//		throw  DuplicateEmployeeException;  
	      }
	      @Override
	      public Employee readRecord(int empid) throws EmployeeNotFindException, SQLException{
	         CallableStatement statement=con.prepareCall("{call readRecord(?)}");
	         statement.setInt(1,empid);
	         int empNo;
	         String empName;
	         double empSalary;
	         ResultSet rs=statement.executeQuery(); // execute the stored procedure  
	//         from result set retrieve the employee record 
	         while (rs.next()) {
	            empNo=rs.getInt(1);
	            if(empNo == empid) {
	            	empName=rs.getString(2);
	            	empSalary=rs.getDouble(3);
	            	double empsalary;
	            	return new Employee(empid,empName,empSalary);
	         }
	         }   
	         throw new EmployeeNotFindException ("Employee not Found");
	         
	        
	      }
	      @Override
	      public boolean  updateRecord(int empid,double empsalary) throws SQLException,EmployeeNotFindException{
	          CallableStatement statement=con.prepareCall("{call updateRecord(?,?)");
	          statement.setInt(1,empid);
	          statement.setDouble(2,empsalary);
	          int updateCount=statement.executeUpdate();
	          System.out.println(updateCount);
	          if(updateCount==0)		
					return true;
				  return false;
	    //       print and see upadteCouny 
	    //       have logics for return 
	          
	            
	      }
	      @Override
	      public boolean  deleteRecord(int empid) throws EmployeeNotFindException, SQLException{
	    	  CallableStatement statement=con.prepareCall("{call deleteRecord(?)");
	    	  statement.setInt(1,empid);
	    	  int deleteCount=statement.executeUpdate();
	    	  System.out.println(deleteCount);
	    	  if(deleteCount==0)		
					return true;
				  return false;
	           
	     }
	      
	}

/*		@Override
		public Employee readRecord(Employee emp, int empid) throws EmployeeNotFoundException, SQLException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean updateRecord(Employee emp, int empid, double empsalary) throws EmployeeNotFoundException {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean deleteRecord(Employee emp, int empid) throws EmployeeNotFoundException {
			// TODO Auto-generated method stub
			return false;
		}

	}
	}

/*	// DML ( insert , update , delete ) --- executeUpdate();
	// DQL ( select ) -- executeQuery();


	Configuration Varies 


	Connection details --> host( ip address ) , port number ,Username , password , databasename


	Statement    -- hard code the complete query 
	Prepared Statement -- query with parameters 
	Callable Statement   -- calling the stored procedure 


	1) Establish the connection ---> Constructor / static block 
	2) do the operation         ---> separate method 
	3) close the connection     ---> separate menthod  



	// statement 
	 boolean  insertRecord(Employee emp) throws DuplicateEmployeeException{
	        stmt="INSERT INTO employee VALUES(101,"Ram",5000);
	        execute the stmt;  
	         

	 }


	// prepared statement 

	  boolean  insertRecord(Employee emp) throws DuplicateEmployeeException{
	        PreparedStatement="INSERT INTO employee VALUES(?,?,?)";
	        receive the values for placeholders(?) at run time from main method
	        execute the PreparedStatemnt
	         
	 }


	// callable Statement 

	boolean  insertRecord(Employee emp) throws DuplicateEmployeeException{
	                boolean result1=false;
			int empid=emp.getEmployeeId();
	                // similarly for name and salary 
			
			CallableStatement statement=con.prepareCall("{call insertRecord(?,?,?)}");
			statement.set...(1,empid);
			statement.setString(2, empName);
			statement.set..... (3, empsalary);
			int insertCount=statement.executeUpdate();// actual execution happens 
			System.out.println(insertCount);
			if(insertCount==0)		
				result1=true;
			
			return result1;    
	        
	          
	         

	 }

	PostGres stored ptrocedure ( this definition is written in postGrs environment )   
	CREATE OR REPLACE FUNCTION insertRecord (int employeeNumber,
	                                         String employeeName,
	                                         double employeeSalary)
	  RETURNS boolean 
	AS
	$BODY
	$
	DECLARE status BOOLEAN;

	BEGIN

		status:=false;
		
	        INSERT INTO employee (employeeNumber,employeeName,employeeSalary) VALUES                             ((employeeNumber,employeeName,employeeSalary));

	        status:=true;

		RETURN status;

	END;



	CREATE OR REPLACE FUNCTION readRecord (int employeeNumber,
	                                          )
	  RETURNS employee
	AS
	$BODY
	$
	DECLARE status BOOLEAN;

	BEGIN

		status:=false;
		
	        SELECT empid,empname,salary INTO host variable FROM employee WHERE empid=employeeNumber RETURN 
	        return hostvariable(employee info)
	END;
}*/
