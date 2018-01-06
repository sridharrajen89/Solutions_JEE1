package com.htc.day1;

public class DuplicateEmployeeIDException {
	
	public DuplicateEmployeeIDException () {
		
	}
	
	private String errorMessage;

	public String getErrorMessage() {
		this.errorMessage = "Duplicate Employee ID";
		return errorMessage;
	}


}
