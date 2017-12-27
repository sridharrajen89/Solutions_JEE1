package com.java.training.exercise13.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class TestCompany {

	public static void main(String[] args) {
		
		//System.out.println("Test 123");

		Employee emp1 = new Employee(101, "Anitha", 10000);
		Employee emp2 = new Employee(102, "Anitha1", 10000);
		HashMap<Integer, Employee> empMap = new  HashMap<Integer, Employee>();
		
		empMap.put(101, emp1);
		Company company = new Company(1, "HTC", "a@HTC.com", empMap);
		System.out.println(company);
		/*company.setEmpMap(empMap);
		
		syso
		company.setCompanyId(1);
		company.setCompanyName("HTC");
		company.setCompanyEmailId("a@htc.com");*/
				
		try {
			company.createEmployee(emp1);
			System.out.println(company);
			/*System.out.println("Before update" + company);
			emp2.setEmpSalary(20000);
			company.updateEmployee(emp2);
			System.out.println("after update" + company);
			company.deleteEmployee(101);
			System.out.println("after delete" + company);
			System.out.println("Retrieving Employees:   " + company.readEmployee(emp2.getEmpId()));
		*/
		}
		
		catch (DuplicateEmployeeIDException e) {
			//e.getErrorMessage();
			System.out.println(e.getErrorMessage());
		} 
		
		/*catch (EmployeeNotFoundException e) {
			System.out.println(e.getErrorMessage());*/
		
		}
		
		
		/*finally {
			company = null;
		
			}
		}*/

		
	
	
}
