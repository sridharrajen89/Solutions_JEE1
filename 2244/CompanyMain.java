package com.htc.javaweek2;

import java.util.List;
import java.util.ArrayList;

public class CompanyMain {

	public static void main(String[] args) throws EmployeeNotFoundException,DuplicateEmployeeIDException {
		try {
				Employee emp = new Employee(123,"Vaithilingam",100000);
				List<Employee> emplist = new ArrayList<Employee>();
				emplist.add(emp);
				Company c = new Company(0001,"HTC","HTC@Gmail.com",emplist);
				System.out.println("readEmployee method.."+c.readEmployee(123));		
				c.createEmployee(new Employee(124,"Gautham",120000));	
				System.out.println("readEmployee method.."+c.readEmployee(124));
				c.updateEmployee(124, 2500000);
				System.out.println("After Update Employee Method " +c.readEmployee(124));
				System.out.println(c);
				System.out.println("Before calling deleteEmployee Method..");
				c.deleteEmployee(124);
				System.out.println("deleteEmployee");
				System.out.println(c);				
		}catch(EmployeeNotFoundException ENF){
			ENF.printStackTrace();
		}catch(DuplicateEmployeeIDException DEID){
			DEID.printStackTrace();
		}catch(Exception E){
			E.printStackTrace();
		}finally{
		
	     }
	} 
}


