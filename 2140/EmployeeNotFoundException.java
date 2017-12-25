package com.htc.corejava.trainingexcerise.week1;

public class EmployeeNotFoundException extends Exception {
	public static final String finalMessage = "The Employee ID you are trying to access does not exist";
	public EmployeeNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeNotFoundException(String message) {
		super(finalMessage);
		// TODO Auto-generated constructor stub
	}

	public EmployeeNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public EmployeeNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public EmployeeNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public String getErrorMessage() {
		return finalMessage;
	}
}
