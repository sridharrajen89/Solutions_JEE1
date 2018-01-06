package com.htc.day1;
import java.util.*;
 interface ICompanyServiceProvider{

	  public boolean createEmployee(Employee obj) throws DuplicateEmployeeIDException;
	  public Employee readEmployee(int employeeId) throws  EmployeeNotFoundException; 
	  public boolean  updateEmployee(int employeeId,double newSalary) throws        EmployeeNotFoundException;
	  public bolean deleteEmployee(int employeeId) throws  EmployeeNotFoundException;

	}

public class Company implements ICompanyServiceProvider  {
	
	   private int companyId;
	   private String companyname;
	   private String companyEmailId;
	   private ArrayList <Employee> emplist;// has-A relation ship 
	   // Constructor
	   // setters , getters 
	   // hashCode,equals,toString 
	   
	   @Override
	   public boolean createEmployee(Employee empobj) throws DuplicateEmployeeIDException{
	     
	     emplist.add(empobj);
	    // logics for handling DuplicateEmployeeIDException;

	   }
	   
	   @Override
	   public Employee readEmployee(int pemployeeId) throws  EmployeeNotFoundException{
	       for (emplist:empobj){
	         if(empobj.getEmployeeId()==pemployeeId)
	            return the employee object 
	        further logics for throw  new EmployeeNotFoundException("Employee is not found ");

	       
	   }
	   @Override
	   public boolean updateEmployee(int employeeId,double newSalary) throws                         EmployeeNotFoundException {
	     
	      for ( iterate the employee list ){
	        if ( serach the employee Id in the list ) 
	          update the list with new salary  // replace 
	     

	   }
	   @Override
	   public bolean deleteEmployee(int employeeId) throws  EmployeeNotFoundException{
	       for ( iterate the emplist )
	         if ( search the employee )
	            delete the occurance from the list 
	        further logics for thorw  new EmployeeNotFoundException("Employee is not found ");
	  
	   }


	

}
