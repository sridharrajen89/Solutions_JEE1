package com.htc.excercise1;

import java.sql.SQLException;

public class JDBCConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HTCGlobalServices htc = new HTCGlobalServices();
		Employee emp = new Employee();
		
		//Select the employee details from employee table
		try {
			emp = htc.readEmployee(101);
		}catch(EmployeeNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//Insert the employee details
		try {
			emp.setEmployeeId(102);
			emp.setEmployeeName("Varshu");
			emp.setEmployeeSalary(54001);
			boolean recCreated = htc.createEmployee(emp);
			if (recCreated == true)
				System.out.println("Employee record is created");
			else
				System.out.println("Employee record is not created");
		}catch(DuplicateEmployeeIDException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//Update the employee details
		try {
			boolean recUpdated = htc.updateEmployee(101, 5000.55);
			if(recUpdated == true)
				System.out.println("Employee record is updated");
			else
				System.out.println("Employee record is not updated");
			
		}catch(EmployeeNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//Delete the employee details
		try {
			boolean recDeleted = htc.deleteEmployee(102);
			if(recDeleted == true)
				System.out.println("Employee record is deleted");
			else
				System.out.println("Employee record is not deleted");
		}catch(EmployeeNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}