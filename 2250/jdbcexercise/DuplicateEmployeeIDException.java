package com.java.exercise3;
public class DuplicateEmployeeIDException extends Exception {
	final String ERRORMESSAGE = "Duplicate Employee Id, Consifer new ID";

	//Getter
	public String getERRORMESSAGE() {
		return ERRORMESSAGE;
	}

}
