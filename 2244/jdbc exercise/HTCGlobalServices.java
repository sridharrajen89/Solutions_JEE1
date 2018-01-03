package com.htc.jdbcexercise;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HTCGlobalServices implements IEmployeeServiceProvider {
	Connection conn;
	ResultSet rs;
	
	public HTCGlobalServices() {
		try {
			conn = new MyDataSource("postgres").getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//getters & setters 
	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	@Override
	public boolean insertEmp(Employee emp) throws DuplicateEmployeeIDException, SQLException {
		CallableStatement stmt = conn.prepareCall("{call insertemp(?,?,?)}");
		boolean flag=false;
		stmt.setInt(1, emp.getEmployeeId());
		stmt.setString(2, emp.getEmployeeName());
		stmt.setDouble(3, emp.getEmployeeSalary());
		int recCount = stmt.executeUpdate();
		if(recCount ==0) {
			flag = true;
			return flag;
		}
		else
			throw new DuplicateEmployeeIDException();
	}

	@Override
	public Employee readEmp(int employeeId) throws EmployeeNotFoundException, SQLException {
		    CallableStatement stmt =conn.prepareCall("{call selectemp(?)}");
	        stmt.setInt(1, employeeId);
	        rs=stmt.executeQuery(); // execute the stored procedure
	        Employee emp = new Employee();
	        if(rs.next()) {
	        	System.out.println("Employee detail Retrieved Successfully:"+rs.getObject(1));
	            return emp;
	        }
	        else
	        	throw new EmployeeNotFoundException("Employee Detail not found");
	}

	@Override
	public boolean updateEmp(int employeeId, double salary) throws EmployeeNotFoundException, SQLException {
		CallableStatement stmt = conn.prepareCall("{call updateemp(?,?)}");
		boolean flag=false;
		stmt.setInt(1,employeeId);
		stmt.setDouble(2, salary);
		int updateCount = stmt.executeUpdate();
		if(updateCount == 0) {
			flag = true;
			return flag;
		}			
		else
			throw new EmployeeNotFoundException("Employee details not found");
	}

	@Override
	public boolean deleteEmp(int employeeId) throws EmployeeNotFoundException, SQLException {
		CallableStatement stmt = conn.prepareCall("{call deleteemp(?)}");
		boolean flag=false;
		stmt.setInt(1, employeeId);
		int deleteCount = stmt.executeUpdate();
		if(deleteCount == 0) {
			flag = true;
			return flag;
		}			
		else
			throw new EmployeeNotFoundException("Employee details are not found");
	}

}
