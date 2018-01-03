package com.htc.jdbcexercise;

import java.sql.SQLException;


public class JdbcMain {

	public static void main(String[] args) {
		Employee emp = new Employee();	
		HTCGlobalServices htc = new HTCGlobalServices();

	//Select Employee detail from employee table
		try {
			emp = htc.readEmp(100);
		}catch(EmployeeNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	//Insert the employee detail into employee table
		try {
			emp.setEmployeeId(102);
			emp.setEmployeeName("Gautham");
			emp.setEmployeeSalary(5000);
			boolean recCreated = htc.insertEmp(emp);
			if (recCreated == true)
				System.out.println("Employee Inserted Successfully: "+emp.getEmployeeId());
			else
				System.out.println("Employee Insertion is not successful");

		}catch(DuplicateEmployeeIDException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();

		}

	//Update the employee detail to existing Record
		try {
			boolean recUpdated = htc.updateEmp(103, 6666.66);
			if(recUpdated == true)
				System.out.println("Employee updated Successfully");
			else
				System.out.println("Employee updation is not Successful");
			
		}catch(EmployeeNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}

	//Delete the employee detail from table
		try {
			boolean recDeleted = htc.deleteEmp(102);
			if(recDeleted == true)
				System.out.println("Employee record deleted Successfully");
			else
				System.out.println("Employee record not deleted Successfully");

		}catch(EmployeeNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();

		}

	}
}
