package com.htc.corejava.trainingexcerise.week1;

import java.util.ArrayList;

public class Company implements ICompanyServiceProvider{
	private int companyID;
	private String companyName;
	private String companyEmailID;
	private ArrayList<Employee> empList;
	
	public Company() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Company(int companyID, String companyName, String companyEmailID, ArrayList<Employee> empList) {
		super();
		this.companyID = companyID;
		this.companyName = companyName;
		this.companyEmailID = companyEmailID;
		this.empList = empList;
	}
	@Override
	public boolean createEmployee(Employee emp) throws DuplicateEmployeeIDException {
		// TODO Auto-generated method stub
		for (Employee empl:empList) {
			if (empl.getEmployeeID()==emp.getEmployeeID()) {
				throw new DuplicateEmployeeIDException("DE");
			}
		}
		empList.add(emp);
		return true;
	}
	@Override
	public Employee readEmployee(int employeeID) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		for (Employee empl:empList) {
			if (empl.getEmployeeID()==employeeID)
				return empl;
		}
		throw new EmployeeNotFoundException("ENF");
	}
	@Override
	public boolean updateEmployee(int employeeID, double employeeSalary) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		for (Employee empl:empList) {
			if (empl.getEmployeeID()==employeeID) {
				empl.setEmployeeSalary(employeeSalary);
				return true;
			}
		}
		throw new EmployeeNotFoundException("ENF");
	}
	@Override
	public boolean deleteEmployee(int employeeID) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		for (Employee empl:empList) {
			if (empl.getEmployeeID()==employeeID) {
				empList.remove(empl);
				return true;
			}
		}
		throw new EmployeeNotFoundException("ENF");
	}
	public int getCompanyID() {
		return companyID;
	}
	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyEmailID() {
		return companyEmailID;
	}
	public void setCompanyEmailID(String companyEmailID) {
		this.companyEmailID = companyEmailID;
	}
	public ArrayList<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(ArrayList<Employee> empList) {
		this.empList = empList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyEmailID == null) ? 0 : companyEmailID.hashCode());
		result = prime * result + companyID;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((empList == null) ? 0 : empList.hashCode());
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
		Company other = (Company) obj;
		if (companyEmailID == null) {
			if (other.companyEmailID != null)
				return false;
		} else if (!companyEmailID.equals(other.companyEmailID))
			return false;
		if (companyID != other.companyID)
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (empList == null) {
			if (other.empList != null)
				return false;
		} else if (!empList.equals(other.empList))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Company [companyID=" + companyID + ", companyName=" + companyName + ", companyEmailID=" + companyEmailID
				+ ", empList=" + empList + "]";
	}
}
