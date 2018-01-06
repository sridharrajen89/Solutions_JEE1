package com.htc.dec30;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee implements IEmployeeServiceProvider 
{
	  private int employeeNumber;
	  private String employeeName;
	  private double employeeSalary;
	/**
	 * 
	 */
	public Employee() 
	{
		super();
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
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeNumber;
		return result;
	}
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
	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	@Override
	public boolean insertRecord(Employee emp) throws DuplicateEmployeeIDException, SQLException, ClassNotFoundException, IOException {
			boolean result1 = false;
			DBCon dbc = new DBCon();
			Connection con = dbc.getConnection();
			int empno =emp.getEmployeeNumber();
			CallableStatement statement = con.prepareCall("{call selectemprecord(?)}");
			statement.setInt(1, empno);
			ResultSet rs = statement.executeQuery();
			if(rs.next())
			{
				throw new DuplicateEmployeeIDException("Employee already exist please enter unique Employee no");
			}
			else
			{
				statement = con.prepareCall("{call insertemprecord(?,?,?)}");
				statement.setInt(1,emp.getEmployeeNumber());
				statement.setString(2, emp.getEmployeeName());
				statement.setDouble(3,emp.getEmployeeSalary());
				int insertCount = statement.executeUpdate();
				if(insertCount == 0)
				{
					result1 =true;
				}
			}

		return result1;
	}
	@Override
	public Employee readRecord(int empid) throws EmployeeNotFoundException, ClassNotFoundException,SQLException, IOException {
		DBCon dbc = new DBCon();
		Connection con = dbc.getConnection();
		CallableStatement statement = con.prepareCall("{call selectemprecord(?)}");
		statement.setInt(1, empid);
		ResultSet rs = statement.executeQuery();
		if(rs.next())
		{
			int empNo = rs.getInt(1);
			String empName = rs.getString(2);
			double empSalary = rs.getDouble(3);
			return new Employee(empNo,empName,empSalary);
		}
	  throw new EmployeeNotFoundException("Entered employee is not found");	
	}
	@Override
	public boolean updateRecord(int empid, double salary) throws EmployeeNotFoundException, ClassNotFoundException,SQLException, IOException 
	{
		boolean result2 = false;
		DBCon dbc = new DBCon();
		Connection con = dbc.getConnection();
		CallableStatement statement = con.prepareCall("{call updateemprecord(?,?)}");
		statement.setInt(1, empid);
		statement.setDouble(2,salary);
		int updateCount = statement.executeUpdate();
		if(updateCount == 0)
		{
			result2 = true;
			return result2;
		}
	  throw new EmployeeNotFoundException("Entered employee is not found");	
	}
	@Override
	public boolean deleteRecord(int empid) throws EmployeeNotFoundException, ClassNotFoundException,SQLException, IOException {
		boolean result3 = false;
		DBCon dbc = new DBCon();
		Connection con = dbc.getConnection();
		CallableStatement statement = con.prepareCall("{call deleteemprecord(?)}");
		statement.setInt(1, empid);
		int deleteCount = statement.executeUpdate();
		if(deleteCount == 0)
		{
			result3 = true;
			return result3;
		}
		
	  throw new EmployeeNotFoundException("Entered employee is not found");
	}

}
