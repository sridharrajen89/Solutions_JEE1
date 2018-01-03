package com.htc.jdbc.examples;
import java.io.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


 class EmployeeJDBC{
	private int empNo;
	private String empName;
	private double empSalary;
	Connection con;
	
	public EmployeeJDBC(int empNo, String empName, double empSalary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empNo;
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
		EmployeeJDBC other = (EmployeeJDBC) obj;
		if (empNo != other.empNo)
			return false;
		return true;
	}
	
	class EmployeeNotFoundException extends Exception {

		private static final long serialVersionUID = -5209769626271723057L;

		private String errorMessage;

		public EmployeeNotFoundException(String errorMessage) {
			super();
			this.errorMessage = errorMessage;
			System.out.println(errorMessage);
		}

		public String getErrorMessage() {
			return errorMessage;
		}

	}
	
	class DuplicateEmployeeIDException extends Exception {

		private static final long serialVersionUID = -5209769626271723057L;

		private String errorMessage;

		public DuplicateEmployeeIDException(String errorMessage) {
			super();
			this.errorMessage = errorMessage;
		}

		public String getErrorMessage() {
			return errorMessage;
		}

	}
	
	interface IEmployeeServiceProvider {

		public boolean insertRecord(EmployeeJDBC emp) throws DuplicateEmployeeIDException, SQLException;

		public EmployeeJDBC readRecord(int employeeId) throws EmployeeNotFoundException, SQLException;

		public boolean updateRecord(int employeeId, double newSalary) throws EmployeeNotFoundException, SQLException;

		public boolean deleteRecord(int employeeId) throws EmployeeNotFoundException, SQLException;

	}
	
	class HTCGlobal implements IEmployeeServiceProvider{

		@Override
		public boolean insertRecord(EmployeeJDBC emp) throws DuplicateEmployeeIDException, SQLException {
			// TODO Auto-generated method stub
			boolean flag=false;
			
			
			int empid= emp.getEmpNo();
			String empname = emp.getEmpName();
			double sal = emp.getEmpSalary();
			con = new MyDataSource("postgres").getConnectio();
			CallableStatement statement = con.prepareCall("{call insertRecord(?,?,?)}");
			statement.setInt(1, empid);
			statement.setString(2, empname);
			statement.setDouble(3, sal);
			
			int insertCount = statement.executeUpdate();
			
			System.out.println(insertCount);
			
			if(insertCount==0) 
				flag = true;
			
			return flag;
		}
		
		
		
		

		@Override
		public EmployeeJDBC readRecord(int employeeId) throws EmployeeNotFoundException, SQLException {
			// TODO Auto-generated method stub
			
			CallableStatement statement=con.prepareCall("{call readRecord(?)}");
			statement.setInt(1, employeeId);
			ResultSet rs=statement.executeQuery();
			
			if(rs.next()) {
		employeeId = rs.getInt(1);
		empName = rs.getString(2);
		empSalary = rs.getDouble(3);
		
			
		}
			return new EmployeeJDBC(employeeId,empName,empSalary);
		}
		
		

		@Override
		public boolean updateRecord(int employeeId, double newSalary) throws EmployeeNotFoundException, SQLException {
			// TODO Auto-generated method stub
			
			CallableStatement statement = con.prepareCall("{call updateRecord(?,?)}");
			statement.setInt(1, employeeId);
			statement.setDouble(3, newSalary);
			int updateCount = statement.executeUpdate();
			System.out.println(updateCount);
				
			return true;
		}

		@Override
		public boolean deleteRecord(int employeeId) throws EmployeeNotFoundException, SQLException {
			// TODO Auto-generated method stub
			CallableStatement statement = con.prepareCall("{call deleteRecord(?)}");
			statement.setInt(1, employeeId);
			int deleteCount = statement.executeUpdate();
			System.out.println(deleteCount);
			
			return true;
		}	
	}	
}

public class CRUDOperationUsingJDBC {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		DBConnector dbc=new DBConnector();
		Connection con=dbc.getConnection();
		UserDAO obj=new UserDAO(con);
		User user=new User("htcc","htc123","troy","htcinc.com");
		System.out.println(obj.registerUser(user));

	}

}
