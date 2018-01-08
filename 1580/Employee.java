package com.htc.week1;
import java.util.*;

/*
Design a class Company which has list of employees,Company class will have control over employees thorugh CRUD operations.



Company class will implements ICompanyServiceProvider interface and override the methods for CRUD operations 



We also have USer defined execptions :-EmployeeNotFoundException , DuplicateEmployeeIDException

*/



// Solution 

class Employee {

  private int employeeId;

  private String employeeName;

  private double employeeSalary;
  


//construrctors
  public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeName = employeeName;  
  }
  // setters , getters 
		  
		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public double getEmployeeSalary() {
			return employeeSalary;
		}

		public void setEmployeeSalary(double employeeSalary) {
			this.employeeSalary = employeeSalary;
		}

		
// toString,equals,hashCode
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + employeeId;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (employeeId != other.employeeId)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
					+ employeeSalary + "]";
		}

		


		
		
		
}



// User defined exceptions



class EmployeeNotFoundException extends Exception{

  private String errorMessage;

  // construtor

  // getter

}



class DuplicateEmployeeIDException extends Exception{

  final String ERRORMESSAGE="Duplicate Employee Id, Consider new Id";

  // getter

}





// interface for CRUD operation

interface ICompanyServiceProvider{



  public boolean createEmployee(Employee obj) throws DuplicateEmployeeIDException;

  public Employee readEmployee(int employeeId) throws  EmployeeNotFoundException; 

  public boolean  updateEmployee(int employeeId,double newSalary) throws        EmployeeNotFoundException;

  public bolean deleteEmployee(int employeeId) throws  EmployeeNotFoundException;



}



class Company implemnts ICompanyServiceProvider{

   private int companyId;

   private String companyname

   private String companyEmailId;

   private ArrayList<Employee> emplist;// has-A relation ship 

   // construtors

   // setters , getters 

   // hashCode,equals,toString 



  @Override

  public boolean createEmployee(Employee empobj) throws DuplicateEmployeeIDException{

    

    emplist.add(empobj);

    logics for handling DuplicateEmployeeIDException;



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





//  main method 



class exericise13{

   public static void main(string args[]){

   try{

        // create objects for Employee 

        // create object for  Company 

        // call the CRUD methods using comapny object   

       }

       catch(EmployeeNotFoundException ENF){

         ...

       }

       catch(DuplicateEmployeeIDException DEID){

          ...

       }

       catch(Exception ex){

         ...

       }

       finally{

          list.clear();

       }

}

   

