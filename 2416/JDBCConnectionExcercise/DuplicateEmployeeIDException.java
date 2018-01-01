package com.htc.excercise1;

public class DuplicateEmployeeIDException extends Exception{
	
	final String errorMessage="Duplicate Employee Id, Consider new Id";
	
	public String getErrorMessage( ) {
		return errorMessage;
	}
}
