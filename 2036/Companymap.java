package test.com;

import java.util.*;
import java.lang.*;

public class Companymap implements ICompanyServiceProvider{ 
	
		   private int companyId;
		   private String companyname;
		   private String companyEmailId;
		   private HashMap<Integer,Employee> empmap=new HashMap<Integer, Employee>();

//Default constructor
		   
		public Companymap() {
			companyId=0;
			companyname="NULL";
			companyEmailId="NULL";
			empmap = null;
		}

//overloaded constructor
		public Companymap(int companyId, String companyname, String companyEmailId, HashMap<Integer, Employee> empmap) {
			super();
			this.companyId = companyId;
			this.companyname = companyname;
			this.companyEmailId = companyEmailId;
			this.empmap = empmap;
		}

//getters and setters
		public int getCompanyId() {
			return companyId;
		}

		public String getCompanyname() {
			return companyname;
		}

		public String getCompanyEmailId() {
			return companyEmailId;
		}

		public HashMap<Integer, Employee> getEmpmap() {
			return empmap;
		}

		public void setCompanyId(int companyId) {
			this.companyId = companyId;
		}

		public void setCompanyname(String companyname) {
			this.companyname = companyname;
		}

		public void setCompanyEmailId(String companyEmailId) {
			this.companyEmailId = companyEmailId;
		}

		public void setEmpmap(HashMap<Integer, Employee> empmap) {
			this.empmap = empmap;
		}

		@Override
		public String toString() {
			return "Companymap [companyId=" + companyId + ", companyname=" + companyname + ", companyEmailId="
					+ companyEmailId + ", empmap=" + empmap + "]";
		}
		
//interface IcompanyServiceProvider
		
		interface ICompanyServiceProvidernew{

			public boolean createEmployee(Employee obj) throws DuplicateEmployeeIDException;
			public Employee readEmployee(int employeeId) throws EmployeeNotFoundException; 
			public boolean  updateEmployee(int employeeId,double newSalary) throws EmployeeNotFoundException;
			public boolean deleteEmployee(int employeeId) throws EmployeeNotFoundException;
						
		}
		
		public boolean createEmployee(Employee obj) throws DuplicateEmployeeIDException{
			
			Set<Integer> keys = empmap.keySet();
			
			for (Integer key: keys) {
				if (key == obj.getEmployeeId()) {
					throw new DuplicateEmployeeIDException();
								
				}
			}
			empmap.put(obj.getEmployeeId(),obj);
			return true;
			
						
		}
						
		public Employee readEmployee(int employeeId) throws EmployeeNotFoundException{
			
			if (empmap.get(employeeId) != null) {
				return empmap.get(employeeId);			
			}
			else 
				throw new EmployeeNotFoundException("Employee does not exist");
		}
			
		public boolean  updateEmployee(int employeeId,double newSalary) throws EmployeeNotFoundException{
			
			if (empmap.get(employeeId) != null) {
				empmap.get(employeeId).setEmployeeSalary(newSalary);
				return true;
				
			}
			else 
				throw new EmployeeNotFoundException("Employee does not exist");
			
		}
		
		public boolean deleteEmployee(int employeeId) throws EmployeeNotFoundException{
			
			if (empmap.get(employeeId) != null) {
				empmap.remove(employeeId);
				return true;
				
			}
			else 
				throw new EmployeeNotFoundException();
			
		}
		
		

		
}
			
			
			
					
			
		
		


