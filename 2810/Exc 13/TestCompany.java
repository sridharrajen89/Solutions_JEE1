package com.htc.Exc2;
import java.util.*;
public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Employee> EmployeeMap = new HashMap<Integer, Employee>();
		try {
			HTCGlobalServices HTC = new HTCGlobalServices(001,"2 Corporate South",EmployeeMap); 
			HTC.createEmployee(new Employee(001,"UdayaPandian"));
			HTC.createEmployee(new Employee(002,"Udaya"));
			HTC.createEmployee(new Employee(003,"Pandian"));
			HTC.createEmployee(new Employee(004,"Kumar"));
			System.out.println(EmployeeMap);
			System.out.println("Read Employee" +HTC.readEmployee(002));
			System.out.println("Before Update"+ EmployeeMap);
			HTC.updateEmployee(003,"Kumar");
			System.out.println("After Update and before delete"+ EmployeeMap);
			HTC.deleteEmployee(004);
			System.out.println("After Delete"+ EmployeeMap);
		}
		catch(DuplicateEmployeeException err) {
			err.printStackTrace();
		}
		catch(EmployeeNotFoundException err) {
			err.printStackTrace();
		}
		finally {
		EmployeeMap.clear();
	}
	}
}
