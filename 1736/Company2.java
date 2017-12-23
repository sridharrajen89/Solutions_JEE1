package com.htcinc.oops.day8;

//Implementation using HashMap
//import java.util.ArrayList;
import java.util.HashMap;

class Company2 implements ICompanyServiceProvider{
	   private int companyId;
	   private String companyName;
	   private String companyEmailId;
	   //private ArrayList<Employee> empList;// has-A relation ship
	   private HashMap<Integer, Employee> empMap;

	 
	  public Company2(int companyId, String companyName, String companyEmailId) {
		this.companyId=companyId;
		this.companyName=companyName;
		this.companyEmailId=companyEmailId;
		//this.empList=new ArrayList<Employee>();
		this.empMap=new HashMap<Integer, Employee>();
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

		//public void setEmpList(ArrayList<Employee> empList) {
		public void setEmpList(HashMap<Integer, Employee> empMap) {
			this.empMap=empMap;
		}

		public HashMap<Integer, Employee> getEmpList() {
			return empMap;
		}

		@Override
		public String toString() {
			//return "Company [companyId=" + companyId + "companyName=" + companyName + ", companyEmailId=" + companyEmailId + ", empList=" + empList + "]";
			return "Company [companyId=" + companyId + "companyName=" + companyName + ", companyEmailId=" + companyEmailId + ", empMap=" + empMap + "]";
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
			Company2 other = (Company2) obj;
			if (companyId != other.companyId)
				return false;
			return true;
		}

		@Override
		  public boolean createEmployee(Employee empObj) throws DuplicateEmployeeIdException{
			/*Note :
			 putIfAbsent() -> Value null will be returned if the key-value mapping is successfully added to the hashmap object 
			If the id is already present on the hashmap the value which is already existing will returned instead.
			*/
			if (empMap.putIfAbsent(empObj.getEmployeeId(), empObj)!=null)
				throw new DuplicateEmployeeIdException();
			else 
				return true;
			
		  }
	  
	  @Override
	  public Employee readEmployee(int pemployeeId) throws  EmployeeNotFoundException {
		  
		if (empMap.containsKey(pemployeeId))
			  return empMap.get(pemployeeId);
		  else
			  throw  new EmployeeNotFoundException("Employee is not found ");
		  
	  }
	  
	  @Override
	  public boolean updateEmployee(int pemployeeId,double newSalary) throws EmployeeNotFoundException {

		  if (empMap.containsKey(pemployeeId))
		  {
			  Employee emp=empMap.get(pemployeeId);
			  emp.setEmployeeSalary(newSalary);
			  empMap.replace(pemployeeId,emp);
			  return true;
		  }
		  else
			  throw  new EmployeeNotFoundException("Employee is not found ");
		
	  }
	  
	  
	  @Override
	  public boolean deleteEmployee(int employeeId) throws  EmployeeNotFoundException{
		  if (empMap.containsKey(employeeId))
		  {
			  empMap.remove(employeeId);
			  return true;
		  }
		  else
			  throw  new EmployeeNotFoundException("Employee is not found ");
	  }

	}

