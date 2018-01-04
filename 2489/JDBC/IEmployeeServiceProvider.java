package com.htc.exe3;

import java.sql.SQLException;

public interface IEmployeeServiceProvider {
	boolean  insertRecord(Employee emp) throws DuplicateEmployeeException, SQLException;
	Employee readRecord(int empId) throws EmployeeNotFoundException, SQLException;
	boolean  updateRecord(int empId, double salary) throws EmployeeNotFoundException,SQLException;
	boolean  deleteRecord(int empId) throws EmployeeNotFoundException, SQLException;
}
