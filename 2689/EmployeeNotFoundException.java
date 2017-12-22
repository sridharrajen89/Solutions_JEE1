package com.exercise;

public class EmployeeNotFoundException extends Exception{
	private String errorMessage;

	public EmployeeNotFoundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
	
	
}
