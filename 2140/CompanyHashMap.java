package com.htc.corejava.trainingexcerise.week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CompanyHashMap implements ICompanyServiceProvider{
	private int companyID;
	private String companyName;
	private String companyEmailID;
	private HashMap<Integer,Employee> empMap;
	
	public CompanyHashMap() {
		// TODO Auto-generated constructor stub
		super();
	}
	public CompanyHashMap(int companyID, String companyName, String companyEmailID, HashMap<Integer, Employee> empMap) {
		super();
		this.companyID = companyID;
		this.companyName = companyName;
		this.companyEmailID = companyEmailID;
		this.empMap = empMap;
	}
	@Override
	public boolean createEmployee(Employee emp) throws DuplicateEmployeeIDException {
		// TODO Auto-generated method stub
		for (Integer key :empMap.keySet()) {
			if (key==emp.getEmployeeID()) {
				throw new DuplicateEmployeeIDException("DE");
			}
		}
		empMap.put(emp.getEmployeeID(), emp);
		return true;
	}
	@Override
	public Employee readEmployee(int employeeID) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		Employee emp = null;
		for (Entry<Integer, Employee> entry : empMap.entrySet()) {
			if (entry.getKey()==employeeID)
				emp = entry.getValue();
				return emp;
		}
		throw new EmployeeNotFoundException("ENF");
	}
	@Override
	public boolean updateEmployee(int employeeID, double employeeSalary) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		for (Entry<Integer, Employee> entry : empMap.entrySet()) {
			if (entry.getKey()==employeeID) {
				entry.getValue().setEmployeeSalary(employeeSalary);
				return true;
			}
		}
		throw new EmployeeNotFoundException("ENF");
	}
	@Override
	public boolean deleteEmployee(int employeeID) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		for (Integer key :empMap.keySet()) {
			if (key==employeeID)
				empMap.remove(key);
				return true;
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
	public HashMap<Integer, Employee> getempMap() {
		return empMap;
	}
	public void setempMap(HashMap<Integer, Employee> empMap) {
		this.empMap = empMap;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyEmailID == null) ? 0 : companyEmailID.hashCode());
		result = prime * result + companyID;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((empMap == null) ? 0 : empMap.hashCode());
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
		CompanyHashMap other = (CompanyHashMap) obj;
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
		if (empMap == null) {
			if (other.empMap != null)
				return false;
		} else if (!empMap.equals(other.empMap))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Company [companyID=" + companyID + ", companyName=" + companyName + ", companyEmailID=" + companyEmailID
				+ ", empMap=" + empMap + "]";
	}
}
