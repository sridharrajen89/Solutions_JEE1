package com.htc.exe2;

import java.util.HashMap;
import java.util.Map;

public class HTCGlobalServices implements ICompanyserviceprovider {
	private int companyID;
	private String address;
	Map<Integer, Employee> EmployeeMap = new HashMap<Integer, Employee>();
	
	public HTCGlobalServices(int companyID, String address, Map<Integer, Employee> employeeMap) {
		super();
		this.companyID = companyID;
		this.address = address;
		EmployeeMap = employeeMap;
	}
	public int getCompanyID() {
		return companyID;
	}
	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + companyID;
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
		if (companyID != other.companyID)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "HTCGlobalServices [companyID=" + companyID + ", address=" + address + ", EmployeeMap=" + EmployeeMap
				+ "]";
	}
	@Override
	public boolean createEmp(Employee empobj) throws InvalidEmployeeException {
		// TODO Auto-generated method stub
		if(EmployeeMap.containsKey(empobj.getEmpID()) == true)
		{
			throw new InvalidEmployeeException("Duplicate Employee");
		}
		else
		{
			EmployeeMap.put(empobj.getEmpID(), empobj);
			return true;
		}
	}
	@Override
	public Employee readEmp(int empID) throws InvalidEmployeeException {
		// TODO Auto-generated method stub
		if(EmployeeMap.containsKey(empID) == true)
			return EmployeeMap.get(empID);
		else
			throw new InvalidEmployeeException("Employee details not found");
	}
	@Override
	public boolean updateEmp(int empID, String empNameNew) throws InvalidEmployeeException {
		// TODO Auto-generated method stub
		if(EmployeeMap.containsKey(empID) == true)
		{
			EmployeeMap.get(empID).setEmpName(empNameNew);
			return true;
		}
		else 
		throw new InvalidEmployeeException("Employee not found to update");
	}
	@Override
	public boolean deleteEmp(int empID) throws InvalidEmployeeException {
		// TODO Auto-generated method stub
		if(EmployeeMap.containsKey(empID) == true)
		{
			EmployeeMap.remove(empID);
			return true;
		}
		else
			throw new InvalidEmployeeException("Employee not found to delete");
	}
	
}
