package com.htc.dec30;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public interface IEmployeeServiceProvider 
{
	 boolean  insertRecord(Employee emp) throws DuplicateEmployeeIDException, SQLException, ClassNotFoundException,IOException;
     Employee readRecord(int empid) throws EmployeeNotFoundException, ClassNotFoundException, SQLException, IOException;
     boolean  updateRecord(int empid,double salary) throws EmployeeNotFoundException, ClassNotFoundException, SQLException, IOException;
     boolean  deleteRecord(int empid) throws EmployeeNotFoundException, ClassNotFoundException, SQLException, IOException;
}
