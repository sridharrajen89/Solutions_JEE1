package com.project14.sql;

public interface IEmployeeServiceProvider {
	
	boolean  insertRecord(Employee emp) throws DuplicateEmployeeException;
	
	

}
