package com.htc.jdbcexercise;

import java.sql.SQLException;

public interface IEmployeeServiceProvider {
	public boolean  insertEmp(Employee emp) throws DuplicateEmployeeIDException, SQLException;
    public Employee readEmp(int employeeId) throws EmployeeNotFoundException, SQLException;
    public boolean  updateEmp(int employeeId,double salary) throws EmployeeNotFoundException, SQLException;
    public boolean  deleteEmp(int employeeId) throws EmployeeNotFoundException, SQLException;
}
