package com.htcinc.oops.day8;

//interface for CRUD operation
public interface ICompanyServiceProvider{

	public boolean createEmployee(Employee obj) throws DuplicateEmployeeIdException;
	public Employee readEmployee(int employeeId) throws  EmployeeNotFoundException; 
	public boolean  updateEmployee(int employeeId,double newSalary) throws        EmployeeNotFoundException;
	public boolean deleteEmployee(int employeeId) throws  EmployeeNotFoundException;

}