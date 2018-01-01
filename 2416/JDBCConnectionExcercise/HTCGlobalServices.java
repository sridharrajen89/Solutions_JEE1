package com.htc.excercise1;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HTCGlobalServices implements IEmployeeServiceProvider{
	//Data members
	Connection con;
	ResultSet rs;
	
	//Default constructor
	public HTCGlobalServices() {
		try {
			con = new MyDataSource("postgres").getConnection();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Setter and Getter
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	//read the employee details from database
	public Employee readEmployee(int employeeId) throws EmployeeNotFoundException, SQLException {
		
       CallableStatement stmt =con.prepareCall("{call selectemprecord(?)}");
       stmt.setInt(1, employeeId);
        rs=stmt.executeQuery(); // execute the stored procedure
        Employee emp = new Employee();
        if(rs.next()) {
        	System.out.println("Employee details:"+rs.getObject(1));
            return emp;
        }
        else
        	throw new EmployeeNotFoundException("Employee record is not found");
    }
	
	//insert the employee details into database 
	public boolean createEmployee(Employee emp) throws DuplicateEmployeeIDException, SQLException {
		CallableStatement stmt = con.prepareCall("{call insertemprecord(?,?,?)}");
		stmt.setInt(1, emp.getEmployeeId());
		stmt.setString(2, emp.getEmployeeName());
		stmt.setDouble(3, emp.getEmployeeSalary());
		int recCount = stmt.executeUpdate();
		if(recCount ==0) 
			return true;
		else
			throw new DuplicateEmployeeIDException();
	}
	
	//update the employee details into database
	public boolean updateEmployee(int employeeId, double newSalary) throws EmployeeNotFoundException, SQLException {
		CallableStatement stmt = con.prepareCall("{call updateemprecord(?,?)}");
		stmt.setInt(1,employeeId);
		stmt.setDouble(2, newSalary);
		int updateCount = stmt.executeUpdate();
		if(updateCount == 0)
			return true;
		else
			throw new EmployeeNotFoundException("Employee details not found");
	}
	
	//Delete the employee details from database
	public boolean deleteEmployee(int employeeId) throws EmployeeNotFoundException, SQLException {
		CallableStatement stmt = con.prepareCall("{call deleteemprecord(?)}");
		stmt.setInt(1, employeeId);
		int deleteCount = stmt.executeUpdate();
		if(deleteCount == 0)
			return true;
		else
			throw new EmployeeNotFoundException("Employee details are not found");
	}
}
