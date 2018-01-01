package com.htc.Exc2;

import java.util.*;

public class HTCGlobalServices implements ICompanyserviceprovider{
	private int companyId;
	private String companyAddress;
	Map <Integer, Employee> EmployeeMap = new HashMap <Integer , Employee>();
	
	public HTCGlobalServices() {
		super();
		this.companyId = 0;
		this.companyAddress = null;
	}
	
	public HTCGlobalServices(int companyId, String companyAddress, Map<Integer, Employee> employeeMap) {
		super();
		this.companyId = companyId;
		this.companyAddress = companyAddress;
		EmployeeMap = employeeMap;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public Map<Integer, Employee> getEmployeeMap() {
		return EmployeeMap;
	}

	public void setEmployeeMap(Map<Integer, Employee> employeeMap) {
		EmployeeMap = employeeMap;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EmployeeMap == null) ? 0 : EmployeeMap.hashCode());
		result = prime * result + ((companyAddress == null) ? 0 : companyAddress.hashCode());
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
		HTCGlobalServices other = (HTCGlobalServices) obj;
		if (EmployeeMap == null) {
			if (other.EmployeeMap != null)
				return false;
		} else if (!EmployeeMap.equals(other.EmployeeMap))
			return false;
		if (companyAddress == null) {
			if (other.companyAddress != null)
				return false;
		} else if (!companyAddress.equals(other.companyAddress))
			return false;
		if (companyId != other.companyId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HTCGlobalServices [companyId=" + companyId + ", companyAddress=" + companyAddress + ", EmployeeMap="
				+ EmployeeMap + "]";
	}
	
	@Override
	public boolean createEmployee(Employee emp) throws DuplicateEmployeeException {
		if (EmployeeMap.get(emp.getEmpId()) != null)
			throw new DuplicateEmployeeException("Employee Already Exists");
		else
			EmployeeMap.put(emp.getEmpId(), emp);
			return true;
	}
	
	@Override
	public Employee readEmployee(int empId) throws EmployeeNotFoundException {
		if (EmployeeMap.get(empId) != null)
			return EmployeeMap.get(empId);
		else
			throw new EmployeeNotFoundException("Employee Not Found");
	}	
	@Override
	public boolean updateEmployee(int empId, String eName) throws EmployeeNotFoundException {
		if (EmployeeMap.get(empId) != null) {
			EmployeeMap.get(empId).setEmpName(eName);
			return true;
		}
		else
			throw new EmployeeNotFoundException("Employee Not Found");
	}		
	
	@Override
	public boolean deleteEmployee(int empId) throws EmployeeNotFoundException {
		if (EmployeeMap.get(empId) != null) {
			EmployeeMap.remove(empId);
			return true;
	}
		else
			throw new EmployeeNotFoundException("Employee Not Found");
	}	
}