package com.project14.sql;

import java.sql.*;
import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;


public class SQLProject1 implements IEmployeeServiceProvider {
	
	Connection con;
	
	public SQLProject1(Connection con) {
		super();
		this.con = con;
	}
	
	
	
	
	
	public boolean  insertRecord(Employee emp) throws DuplicateEmployeeException {
		
        boolean result1=false;
      	int empid=emp.getEmployeenumber();
        String employeeName = emp.getEmployeeName();
        String employeeSalary = emp.getEmployeeSalary();
        
        //Connection con = null;
		//PreparedStatement preparedStatement = null;
		
				
		try
		{
				        
        CallableStatement  statement = con.prepareCall("{call employee(?,?,?)}");
        
			statement.setInt(1, empid);
		
			statement.setString(2, employeeName);
		
			statement.setString(3, employeeSalary);
		 
      
			int insertCount=statement.executeUpdate();// actual execution happens 
			System.out.println(insertCount);
			if(insertCount==0)		
				result1=true;
			
		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}
        
		return result1;
               
                
	}

}
