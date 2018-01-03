package com.htc.jdbcexercise;

public class DuplicateEmployeeIDException extends Exception {
	final String ERRORMESSAGE="Duplicate Employee Id, Consider new Id";

	public String getERRORMESSAGE() {
		return ERRORMESSAGE;
	}
	
}
