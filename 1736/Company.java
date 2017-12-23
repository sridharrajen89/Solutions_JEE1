package com.htcinc.oops.day8;

import java.util.ArrayList;

class Company implements ICompanyServiceProvider{
	   private int companyId;
	   private String companyName;
	   private String companyEmailId;
	   private ArrayList<Employee> empList;// has-A relation ship 

	 
	  public Company(int companyId, String companyName, String companyEmailId) {
		this.companyId=companyId;
		this.companyName=companyName;
		this.companyEmailId=companyEmailId;
		this.empList=new ArrayList<Employee>();
	  }
	   

		public int getCompanyId() {
			return companyId;
		}

		public void setCompanyId(int companyId) {
			this.companyId=companyId;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName=companyName;
		}

		public String getCompanyEmailId() {
			return companyEmailId;
		}

		public void setCompanyEmailId(String companyEmailId) {
			this.companyEmailId=companyEmailId;
		}

		public void setEmpList(ArrayList<Employee> empList) {
			this.empList=empList;
		}

		public ArrayList<Employee> getEmpList() {
			return empList;
		}

		@Override
		public String toString() {
			return "Company [companyId=" + companyId + "companyName=" + companyName + ", companyEmailId=" + companyEmailId + ", empList=" + empList + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result=1;
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

		/*
		 Cannot use the below as we should not have Try/Catch block
	  @Override
	  public boolean createEmployee(Employee empobj) throws DuplicateEmployeeIdException{
	    
		Employee emp=null;
		try {
			emp=readEmployee(empobj.getEmployeeId());
			if (emp != null)
				throw new DuplicateEmployeeIdException();
		} catch(EmployeeNotFoundException e) {
			empList.add(empobj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	  }
	  */
		
		@Override
		  public boolean createEmployee(Employee empObj) throws DuplicateEmployeeIdException{

			for (Employee emp : empList ) {
				if (emp.getEmployeeId() == empObj.getEmployeeId())
					throw new DuplicateEmployeeIdException();
			}
			
			empList.add(empObj);
			return true;
		  }
	  
	  @Override
	  public Employee readEmployee(int pemployeeId) throws  EmployeeNotFoundException{
	            for (Employee emp: empList){
	      	         if (emp.getEmployeeId() == pemployeeId)
	          		 return emp;
		}
	      
		throw  new EmployeeNotFoundException("Employee is not found ");
	  }
	  
	  @Override
	  public boolean updateEmployee(int pemployeeId,double newSalary) throws EmployeeNotFoundException {
	    
	              for (Employee emp: empList){
	      	         if (emp.getEmployeeId() == pemployeeId) {
	      	        	 	emp.setEmployeeSalary(newSalary);
	          		 return true;
			}
		}
		throw  new EmployeeNotFoundException("Employee is not found ");
	  }
	  
	  
	  @Override
	  public boolean deleteEmployee(int employeeId) throws  EmployeeNotFoundException{
		int i=-1;
	              for (Employee emp: empList){
	            	  	i++;
	      	         if (emp.getEmployeeId() == employeeId) {
	      	        	 	empList.remove(i);
	          		 return true;
			}
		}
		throw  new EmployeeNotFoundException("Employee is not found "); 
	  }

	}

