package com.htc.exe2;

public interface ICompanyserviceprovider {
	boolean createEmp(Employee empobj) throws InvalidEmployeeException;
	Employee readEmp(int empID) throws InvalidEmployeeException;
	boolean updateEmp(int empID, String empNameNew)throws InvalidEmployeeException; 
	boolean deleteEmp(int empID)throws InvalidEmployeeException;
}
