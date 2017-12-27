package com.java.training.exercise13.hashmap;

import java.util.HashMap;

public class Company implements ICompanyServiceProvider {

	private int companyId;
	private String companyName;
	private String companyEmailId;
	private HashMap<Integer, Employee> empMap = new  HashMap<Integer, Employee>();

	public Company(int companyId, String companyName, String companyEmailId, HashMap<Integer, Employee> empMap) {
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyEmailId = companyEmailId;
		this.empMap = new HashMap<Integer, Employee>();

		this.empMap = empMap;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyEmailId() {
		return companyEmailId;
	}

	public void setCompanyEmailId(String companyEmailId) {
		this.companyEmailId = companyEmailId;
	}

	public HashMap<Integer,Employee> getempMap() {
		return empMap;
	}

	public void setEmpMap(HashMap<Integer,Employee> empMap) {
		this.empMap = empMap;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyEmailId == null) ? 0 : companyEmailId.hashCode());
		result = prime * result + companyId;
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
		if (companyEmailId == null) {
			if (other.companyEmailId != null)
				return false;
		} else if (!companyEmailId.equals(other.companyEmailId))
			return false;
		if (companyId != other.companyId)
			return false;
		return true;

	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyEmailId=" + companyEmailId
				+ ", empMap=" + empMap + "]";
	}

	public boolean createEmployee(Employee employee) throws DuplicateEmployeeIDException {

		if (empMap.get(employee.getEmpId()) != null) {
			throw  new DuplicateEmployeeIDException("Duplicate EmpID");
		}
		else {

			empMap.put(102, employee);
			return true;

		}
	}

	/*public Employee readEmployee(int EmpId) throws EmployeeNotFoundException {

		for (Employee emp:empMap) {
			if (emp.getEmpId() == EmpId) {
				return emp;
			}
		}

		throw  new EmployeeNotFoundException("Employee Not Found");
	}


	public boolean updateEmployee(Employee employee) throws EmployeeNotFoundException {

		for (Employee emp:empMap) {
			if (emp.getEmpId() == employee.getEmpId()) {
				emp.setEmpName(employee.getEmpName());
				emp.setEmpSalary(employee.getEmpSalary());

				return true;
			}
		}

		throw  new EmployeeNotFoundException("Employee Not Found");
	}


	public boolean deleteEmployee(int EmpId) throws EmployeeNotFoundException {

		for (Employee emp:empMap) {

			if (emp.getEmpId() == EmpId) {

				this.empMap.remove(emp);
				return true;
			}

		}
		throw  new EmployeeNotFoundException("Employee Not Found");
	}*/
}
