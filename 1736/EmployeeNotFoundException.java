package com.htcinc.oops.day8;

//User defined exceptions

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception{
	
	private String errorMessage;
	
	public EmployeeNotFoundException(String errorMessage) {
		this.errorMessage=errorMessage;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
}
