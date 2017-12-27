package com.java.training.exercise13.hashmap;

	public interface ICompanyServiceProvider {
		
		public boolean createEmployee(Employee obj) throws DuplicateEmployeeIDException;
		
		/*public Employee readEmployee(int employeeId) throws EmployeeNotFoundException; 
		
		public boolean  updateEmployee(Employee obj) throws EmployeeNotFoundException;
		
		public boolean deleteEmployee(int employeeId) throws EmployeeNotFoundException;	*/	
	}