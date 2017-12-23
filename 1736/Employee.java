package com.htcinc.oops.day8;

import java.io.Serializable;

/*
Design a class Company which has list of employees,Company class will have control over employees through CRUD operations.

Company class will implements ICompanyServiceProvider interface and override the methods for CRUD operations 

We also have USer defined exceptions :-EmployeeNotFoundException , DuplicateEmployeeIDException
*/

// Solution 
public class Employee implements Serializable {
	private static final long serialVersionUID = -3722305420463808846L;
	
	private int employeeId;
	private String employeeName;
	private double employeeSalary;

	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	
	public double getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary=employeeSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId=employeeId;
	}



 	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeSalary=" + employeeSalary + ", employeeId=" + employeeId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result=1;
		result = prime * result + employeeId;
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
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		return true;
	}

}
