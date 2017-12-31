package com.htc.exe2;

public class Employee {
	private int empID;
	private String empName;
	private String empEmail;
	
	public Employee(int empID, String empName, String empEmail) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empEmail = empEmail;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	} 

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empID;
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
		if (empID != other.empID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empEmail=" + empEmail + "]";
	}

}
