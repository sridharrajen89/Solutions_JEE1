package com.java.exercise3;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HTCGlobalServices implements IEmployeeServiceProvider {
	
	Connection con;
	public HTCGlobalServices(Connection con) {
		super();
		this.con = con;
	}
	
	//Insert record
	@Override
	public boolean  insertRecord(Employee emp) throws DuplicateEmployeeIDException, SQLException
	{
		boolean result1 = false;
		int empno=emp.getEmployeenumber();
		String empname=emp.getEmployeeName();
		double salary = emp.getEmployeeSalary();
		
		CallableStatement statement = con.prepareCall("{call insertrec(?,?,?)}");
		statement.setInt(1, empno);
		statement.setString(2,empname);
		statement.setInt(3,(int) salary);
		int insertCount = statement.executeUpdate();
		System.out.println(insertCount);
		if(insertCount==0)
		result1=true;
		if(result1==false) {
		throw new DuplicateEmployeeIDException();}
		return result1;
		
	}
	
	//Read record
	@Override
	public Employee readRecord(int empno) throws EmployeeNotFoundException, SQLException {
	
		PreparedStatement stmt= null;
        stmt = con.prepareStatement("SELECT * FROM EMPLOYEE where EMPNO="+empno+";");
        ResultSet rs = stmt.executeQuery();
        while ( rs.next() ) {
            int id = rs.getInt("EMPNO");
            String  name = rs.getString("EMPNAME");
            double salary = rs.getFloat("salary");
            return new Employee(id,name,salary);

	}
        throw new EmployeeNotFoundException("Employee not found");
		  	
	}

	//Update table
@Override
public boolean  updateRecord(int empno,double salary) throws EmployeeNotFoundException, SQLException{
		boolean result1 = false;
		CallableStatement statement = con.prepareCall("{call updaterec(?,?)}");
		statement.setInt(1, empno);
		statement.setInt(2,(int) salary);
		int insertCount = statement.executeUpdate();
		System.out.println(insertCount);
		if(insertCount!=0)
			result1=true;
		if(result1==false) {
			throw new EmployeeNotFoundException("Employee not found");}
	return result1;
}

//Delete record
@Override
public boolean  deleteRecord(int empno) throws EmployeeNotFoundException,SQLException
{
	boolean result1 = false;
	CallableStatement statement = con.prepareCall("{call deleterec(?)}");
	statement.setInt(1, empno);
	statement.executeQuery();
	result1=true;
	if(result1==false)
	{throw new EmployeeNotFoundException("Employee not found");}
	return result1;
	}

}