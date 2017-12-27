package com.java.training.exercise13.hashmap;

public class EmployeeNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 123456789;
	private String errorMessage;

	public EmployeeNotFoundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
