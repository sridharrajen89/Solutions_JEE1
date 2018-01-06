package com.htc.day1;

public class Agenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			// create objects for Employee
			Employee emp = new Employee ();
		
	        // create object for  Company
			Company comp = new Company();
	        // call the CRUD methods using comapny object 
			
			//comp.createEmployee(empobj);
			
			
			
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

}
