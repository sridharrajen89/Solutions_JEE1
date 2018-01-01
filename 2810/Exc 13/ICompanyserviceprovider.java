package com.htc.Exc2;
import java.util.*;

public interface ICompanyserviceprovider {
	boolean createEmployee(Employee emp) throws DuplicateEmployeeException	;
	Employee readEmployee(int empId) throws EmployeeNotFoundException;
	boolean updateEmployee(int empId, String empName) throws EmployeeNotFoundException;
	boolean deleteEmployee(int empId) throws EmployeeNotFoundException;
}
