package com.htc.servletExercise;

@SuppressWarnings("serial")

public class UserNameDuplicateException extends Exception 
{
	String errorMessage;
	public UserNameDuplicateException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	

}