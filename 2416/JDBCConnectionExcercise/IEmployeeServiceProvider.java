package com.htc.excercise1;

import java.sql.SQLException;

public interface IEmployeeServiceProvider {

	public boolean createEmployee(Employee obj) throws DuplicateEmployeeIDException, SQLException;
	public Employee readEmployee(int employeeId) throws  EmployeeNotFoundException, SQLException; 
	public boolean  updateEmployee(int employeeId,double newSalary) throws EmployeeNotFoundException, SQLException;
	public boolean deleteEmployee(int employeeId) throws  EmployeeNotFoundException, SQLException;
}
