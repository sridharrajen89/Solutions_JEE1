package com.htc.training;

import java.util.HashMap;

public class CompanyMs implements ICompanyServiceProvider {
	
	   private int companyId;
	   private String companyname;
	   private String companyEmailId;
	   private HashMap<Integer,Employee> hmap = new HashMap<Integer,Employee>();
	   	 
		/**
	 * @param companyId
	 * @param companyname
	 * @param companyEmailId
	 * @param hmap
	 */
	public CompanyMs(int companyId, String companyname, String companyEmailId, HashMap<Integer, Employee> hmap) {
		super();
		this.companyId = companyId;
		this.companyname = companyname;
		this.companyEmailId = companyEmailId;
		this.hmap = hmap;
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

		public HashMap<Integer, Employee> getHmap() {
			return hmap;
		}

		public void setHmap(HashMap<Integer, Employee> hmap) {
			this.hmap = hmap;
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
			CompanyMs other = (CompanyMs) obj;
			if (companyId != other.companyId)
				return false;
			return true;
		}

	@Override
		public String toString() {
			return "CompanyMs [companyId=" + companyId + ", companyname=" + companyname + ", companyEmailId="
					+ companyEmailId + ", hmap=" + hmap + "]";
		}
	
	public boolean createEmployee(Employee e) throws DuplicateEmployeeIDException
	 {
		int key = e.getEmployeeId();
		    if(hmap.get(key)!=null)
		         throw new DuplicateEmployeeIDException();
		 hmap.put(key,e);
			return true;
	 }
	public Employee readEmployee(int employeeId) throws  EmployeeNotFoundException
	 {
		if(hmap.get(employeeId)!=null)
		 	 return hmap.get(employeeId);
		 throw new EmployeeNotFoundException("Entered Employee is not found");
			 
	 }
	
	public boolean updateEmployee(int employeeId,double newSalary) throws EmployeeNotFoundException
	{
		if(hmap.get(employeeId)!=null)
		{
			hmap.get(employeeId).setEmployeeSalary(newSalary);
				return true;
		}		
	 throw new EmployeeNotFoundException("Entered Employee is not found");
		
	}
	public boolean deleteEmployee(int employeeId) throws  EmployeeNotFoundException
	{
		if(hmap.get(employeeId)!=null)
		{
			hmap.remove(employeeId);
				return true;
		}		
	 throw new EmployeeNotFoundException("Entered Employee is not found");	
		 
	}
}
