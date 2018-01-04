package com.htc.exe3;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HTCGlobalServices implements IEmployeeServiceProvider {
	Connection con;
	public HTCGlobalServices(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public boolean insertRecord(Employee emp) throws DuplicateEmployeeException, SQLException {
		// TODO Auto-generated method sub
		int empId = emp.getEmpID();
		String empName = emp.getEmpName();
		double empSalary = emp.getEmpSalary();
		CallableStatement statement=con.prepareCall("{call insertRecord(?,?,?)}");
		statement.setInt(1,empId);
		statement.setString(2,empName);
		statement.setDouble(3,empSalary);
		int insertCount=statement.executeUpdate();
//		System.out.println(insertCount);
		if(insertCount !=0)		
		throw new DuplicateEmployeeException("Duplicate Employee Exception");
		return true;
	}

	@Override
	public Employee readRecord(int empId) throws EmployeeNotFoundException, SQLException {
		// TODO Auto-generated method stub
		CallableStatement statement=con.prepareCall("{call readRecord(?)}");
		statement.setInt(1, empId);
		ResultSet rs=statement.executeQuery(); 
		if(rs.next()) {
			int empnum=rs.getInt(1);
			String empname=rs.getString(2);
			double empsal = rs.getDouble(3);
			Employee emp = new Employee(empnum,empname,empsal);
			System.out.println(emp);
			return emp;
		}
		throw new EmployeeNotFoundException("Employee ID details not found");
	}

	@Override
	public boolean updateRecord(int empId, double salary) throws EmployeeNotFoundException, SQLException {
		// TODO Auto-generated method stub
		CallableStatement statement=con.prepareCall("{call updaterecord(?,?)}");
		statement.setInt(1, empId);
		statement.setDouble(2, salary);
		int updateCount=statement.executeUpdate();
		if (updateCount==0) {
			System.out.println("Record has been updated");
					return true;
		}else
		throw new EmployeeNotFoundException("Employee Not Found to update the salary for the ID: "+empId);
	}

	@Override
	public boolean deleteRecord(int empId) throws EmployeeNotFoundException, SQLException{
		// TODO Auto-generated method stub
		CallableStatement statement=con.prepareCall("{call deleterecord(?)}");
		statement.setInt(1, empId);
		int deleteCount=statement.executeUpdate();
		if(deleteCount==0) {
			System.out.println("Record deleted sucessfully");
			return true;
		}else
		throw new EmployeeNotFoundException("Employee record not found to delete");
	}

}
