package com.exercise;

import java.util.ArrayList;

public class EmployeeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		try {
			Employee emp;
			emp = new Employee(101, "nam1", 1000);
			empList.add(emp);
			emp = new Employee(102, "nam2", 2000);
			Company comp = new Company(2222, "HTC", "NULL",empList );
			comp.createEmployee(emp);
			System.out.println(comp.readEmployee(101));
			comp.updateEmployee(101, 5000);
			System.out.println(comp.readEmployee(101));
			System.out.println(comp.readEmployee(102));
			comp.deleteEmployee(102);
			comp.readEmployee(102);
		} catch (DuplicateEmployeeIDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (EmployeeNotFoundException e1){
//			 e1.printStackTrace();
			 System.out.println(e1.getErrorMessage());
//			 System.out.println("Employee not found");
		 }
	}

}
