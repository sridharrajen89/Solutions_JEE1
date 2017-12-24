package com.htc.training;

import java.util.ArrayList;

public class Company implements ICompanyServiceProvider {
	
	   private int companyId;
	   private String companyname;
	   private String companyEmailId;
	   private ArrayList<Employee> emplist;
	 
	   public Company(int companyId, String companyname, String companyEmailId, ArrayList<Employee> emplist) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyEmailId == null) ? 0 : companyEmailId.hashCode());
		result = prime * result + companyId;
		result = prime * result + ((companyname == null) ? 0 : companyname.hashCode());
		result = prime * result + ((emplist == null) ? 0 : emplist.hashCode());
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
		if (companyname == null) {
			if (other.companyname != null)
				return false;
		} else if (!companyname.equals(other.companyname))
			return false;
		if (emplist == null) {
			if (other.emplist != null)
				return false;
		} else if (!emplist.equals(other.emplist))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyname=" + companyname + ", companyEmailId=" + companyEmailId
				+ ", emplist=" + emplist + "]";
	}

	 public boolean createEmployee(Employee e) throws DuplicateEmployeeIDException
	 {	for(Employee e1 : emplist)
	 {
		 if (e1.getEmployeeId()==e.getEmployeeId())
		 {
			 throw new DuplicateEmployeeIDException();
		 }
		 
	 }	 
		 
			 emplist.add(e);
			 return true;
		 
		 
	 }

	public Employee readEmployee(int employeeId) throws  EmployeeNotFoundException
	 {
				 
		 for(Employee e:emplist)
		 {
			 if(e.getEmployeeId() == employeeId)
			 return e;
		 }	 
			 
		  throw new EmployeeNotFoundException("Entered Employee is not found");
			 
	 }
	
	public boolean updateEmployee(int employeeId,double newSalary) throws EmployeeNotFoundException
	{
		for(Employee e:emplist)
		{
			if(e.getEmployeeId() == employeeId)
			{
				e.setEmployeeSalary(newSalary);
				return true;
			}
		}	
		 throw new EmployeeNotFoundException("Entered Employee is not found");
		}
	
	public boolean deleteEmployee(int employeeId) throws  EmployeeNotFoundException
	{
		for(Employee e:emplist)
		{
			if(e.getEmployeeId() == employeeId)
			{
				emplist.remove(e);
				return true;
			}
		}	
		 throw new EmployeeNotFoundException("Entered Employee is not found");
	}
}
