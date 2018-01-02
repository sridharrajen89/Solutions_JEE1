package com.project14.sql;



public class EmployeeNotFoundException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final String errorMessage="Employee ID not found.";

	public String getErrorMessage() {
		return errorMessage;
	}
	
}
