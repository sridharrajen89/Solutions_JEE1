package com.java.exercise3;

public class Employee {
	
	 private int employeenumber;
	 private String employeeName;
	 private double employeeSalary;
	 
	 //Constructors 
	public Employee(int employeenumber, String employeeName, double employeeSalary) {
		super();
		this.employeenumber = employeenumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	 //getter & Setter
	public int getEmployeenumber() {
		return employeenumber;
	}

	public void setEmployeenumber(int employeenumber) {
		this.employeenumber = employeenumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	  
 //hashcode , equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeenumber;
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
		if (employeenumber != other.employeenumber)
			return false;
		return true;
	}

	//toString()
	@Override
	public String toString() {
		return "Employee [employeenumber=" + employeenumber + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

}

