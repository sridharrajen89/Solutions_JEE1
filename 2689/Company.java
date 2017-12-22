package com.exercise;

import java.util.ArrayList;

class Company implements ICompanyServiceProvider{
	   private int companyId;
	   private String companyname;
	   private String companyEmailId;
	   private ArrayList<Employee> emplist; // has-A relation ship 
	   
	   
	   
	public Company(int companyId, String companyname, String companyEmailId,
			ArrayList<Employee> emplist) {
		super();
		this.companyId = companyId;
		this.companyname = companyname;
		this.companyEmailId = companyEmailId;
		this.emplist = emplist;
	}
	
	
	public int getCompanyId() {
		return companyId;
	}


	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}


	public String getCompanyname() {
		return companyname;
	}


	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}


	public String getCompanyEmailId() {
		return companyEmailId;
	}


	public void setCompanyEmailId(String companyEmailId) {
		this.companyEmailId = companyEmailId;
	}


	public ArrayList<Employee> getEmplist() {
		return emplist;
	}


	public void setEmplist(ArrayList<Employee> emplist) {
		this.emplist = emplist;
	}
	
	

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyname="
				+ companyname + ", companyEmailId=" + companyEmailId
				+ ", emplist=" + emplist + "]";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (companyId != other.companyId)
			return false;
		return true;
	}


	@Override
	public boolean createEmployee(Employee empObj)
			throws DuplicateEmployeeIDException {
		// TODO Auto-generated method stub
		for(Employee emp:emplist){
			if(emp.getEmployeeId()==empObj.getEmployeeId()){
				throw new DuplicateEmployeeIDException();
			}
		}
		emplist.add(empObj);
		System.out.println("inside created employee"+emplist);
		return true;
	}
	@Override
	public Employee readEmployee(int pemployeeId)
			throws EmployeeNotFoundException {
		for(Employee emp:emplist){
			if(emp.getEmployeeId()==pemployeeId){
				return emp;
			}
			
		}
		throw new EmployeeNotFoundException("Employee not found");
	}
	@Override
	public boolean updateEmployee(int pemployeeId, double pnewSalary)
			throws EmployeeNotFoundException {
		for(Employee emp:emplist){
			if(emp.getEmployeeId()==pemployeeId){
				emp.setEmployeeSalary(pnewSalary);
				return true;
			}
		}
		throw new EmployeeNotFoundException("Employee not found");
	}
	@Override
	public boolean deleteEmployee(int pemployeeId)
			throws EmployeeNotFoundException {
		for(Employee emp:emplist){
			if(emp.getEmployeeId()==pemployeeId){
				emplist.remove(emp);
				return true;
			}
			System.out.println("successfully deleted"+pemployeeId);
	}
		throw new EmployeeNotFoundException("EMployee not found");
}
}
