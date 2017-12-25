package com.htc.corejava.trainingexcerise.week1;

public class DuplicateEmployeeIDException extends Exception {

	public static final String finalMessage = "The Employee ID you are trying to create already exists, please try creating a new Employee ID";
	public DuplicateEmployeeIDException() {
		// TODO Auto-generated constructor stub
	}

	public DuplicateEmployeeIDException(String message) {
		super(finalMessage);
		// TODO Auto-generated constructor stub
	}

	public DuplicateEmployeeIDException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public DuplicateEmployeeIDException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DuplicateEmployeeIDException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public String getErrorMessage() {
		return finalMessage;
	}

}
