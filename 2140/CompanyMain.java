package com.htc.corejava.trainingexcerise.week1;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyMain {

	static ArrayList<Employee> empList = new ArrayList<Employee>();
	static Employee emp = new Employee();
	static Company comp = new Company(1,"HTC Global Services","HTC@Gmail.com",empList);
	static Scanner eid;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		do{
				System.out.println("Welcome to -- "+comp.getCompanyName()+" --\nPlease choose from the folowing menu..");
				System.out.println("1. Create Employee\n2. Read Employee by EmpNo\n3. Update Employee Salary\n4. Delete Employee by EmpNo\n5. Print all Employee details\n6. Exit\nPlease enter your choice");
				eid = new Scanner(System.in);
				//				eid.nextLine();
				switch(eid.nextLine()){
					case "1":
						createCompanyEmployee();
						System.out.println("Employee created..");
						break;
					case "2":
						readCompanyEmployee();
						break;
					case "3":
						updateCompanyEmployee();
						System.out.println("Employee updated..");
						break;
					case "4":
						deleteCompanyEmployee();
						System.out.println("Employee deleted..");
						break;
					case "5":
						printCompanyEmployees();
						break;
					case "6":
						System.out.println("Thanks for using the system..");
						System.exit(0);
						break;
					default:
						System.out.println("Invalid choice.. Please enter your choice again from the following menu");
						break;
				}
		}while(true);
	}
	private static void createCompanyEmployee() throws DuplicateEmployeeIDException{
		// TODO Auto-generated method stub
		Employee empTemp = new Employee();
		System.out.println("Enter Employee ID:");
		empTemp.setEmployeeID(Integer.parseInt(eid.nextLine()));
		System.out.println("Enter Employee Name:");
		empTemp.setEmployeeName(eid.nextLine());
		System.out.println("Enter Employee Salary:");
		empTemp.setEmployeeSalary(Double.parseDouble(eid.nextLine()));
		try {
			comp.createEmployee(empTemp);
		}
		catch(DuplicateEmployeeIDException de) {
			de.printStackTrace();
		}
	}
	private static void readCompanyEmployee() throws EmployeeNotFoundException{
		// TODO Auto-generated method stub
		System.out.println("Enter Employee ID:");
		try{
			System.out.println(comp.readEmployee(Integer.parseInt(eid.nextLine())));
		}
		catch(EmployeeNotFoundException enf) {
			enf.printStackTrace();
		}
	}
	private static void updateCompanyEmployee() throws EmployeeNotFoundException, Exception{
		// TODO Auto-generated method stub
		System.out.println("Enter Employee ID:");
		emp.setEmployeeID(Integer.parseInt(eid.nextLine()));
		System.out.println("Enter Employee Salary:");
		emp.setEmployeeSalary(Double.parseDouble(eid.nextLine()));
		try {
			comp.updateEmployee(emp.getEmployeeID(), emp.getEmployeeSalary());
		}
		catch(EmployeeNotFoundException enf) {
			enf.printStackTrace();
		}
	}
	private static void deleteCompanyEmployee() throws EmployeeNotFoundException{
		// TODO Auto-generated method stub
		System.out.println("Enter Employee ID:");
		try{
			comp.deleteEmployee(Integer.parseInt(eid.nextLine()));
		}
		catch(EmployeeNotFoundException enf) {
			enf.printStackTrace();
		}
	}
	private static void printCompanyEmployees(){
		// TODO Auto-generated method stub
		if (empList.size()!=0) {
			System.out.println(comp.getCompanyName()+" has total "+empList.size()+" employees");
			System.out.println(comp);
		}
		else
			System.out.println("No employees in company - "+comp.getCompanyName());
	}
}
