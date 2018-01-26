package com.htc.servletExercise;

@SuppressWarnings("serial")

public class InvalidCredentialException extends Exception{
	private String errorMessage;	
	public InvalidCredentialException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}



}