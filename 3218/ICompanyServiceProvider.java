package com.htc.training;

public interface ICompanyServiceProvider {
	
	  public boolean createEmployee(Employee obj) throws DuplicateEmployeeIDException;
	  public Employee readEmployee(int employeeId) throws  EmployeeNotFoundException; 
	  public boolean  updateEmployee(int employeeId,double newSalary) throws EmployeeNotFoundException;
	  public boolean deleteEmployee(int employeeId) throws  EmployeeNotFoundException;

}
