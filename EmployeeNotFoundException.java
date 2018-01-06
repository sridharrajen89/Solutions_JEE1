package com.htc.day1;

public class EmployeeNotFoundException  extends Exception{
	
	public EmployeeNotFoundException () {
		
	}
	private String errorMessage;

	public String getErrorMessage() {
		this.errorMessage = "Employee Not Found";
		return errorMessage;
	}


	  // construtor
	  // getter

}
