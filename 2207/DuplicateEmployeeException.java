package com.project14.sql;

public class DuplicateEmployeeException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public static final String errorMessage = "duplicate employee found!";

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getErrormesage() {
		return errorMessage;
	}
		
}
