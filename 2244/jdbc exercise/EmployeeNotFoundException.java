package com.htc.jdbcexercise;

public class EmployeeNotFoundException extends Exception{
	private String errorMessage;
	//Constructor
	public EmployeeNotFoundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	//getters
	public String getErrorMessage() {
		return errorMessage;
	}

}
