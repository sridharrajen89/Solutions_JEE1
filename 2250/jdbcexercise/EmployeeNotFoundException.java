package com.java.exercise3;

public class EmployeeNotFoundException extends Exception{

	private String errorMessage;
	//Overloaded Constructor
	public EmployeeNotFoundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	
	//Getter
	public String getErrorMessage() {
		return errorMessage;
	}
	
}
