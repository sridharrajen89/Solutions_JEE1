package com.java.exercise3;

import java.sql.SQLException;

public interface IEmployeeServiceProvider {
	public boolean  insertRecord(Employee emp) throws DuplicateEmployeeIDException,SQLException;
    public Employee readRecord(int empno) throws EmployeeNotFoundException,SQLException;
    public boolean  updateRecord(int empno,double salary) throws EmployeeNotFoundException,SQLException;
    public boolean  deleteRecord(int empno) throws EmployeeNotFoundException,SQLException;

}
