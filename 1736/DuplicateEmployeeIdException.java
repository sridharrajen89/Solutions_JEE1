package com.htcinc.oops.day8;

@SuppressWarnings("serial")
public class DuplicateEmployeeIdException extends Exception{
	final String ERRORMESSAGE="Duplicate Employee Id, Consider new Id";

	public String getErrorMessage() {
		return ERRORMESSAGE;
	}
}
