package com.java.training.exercise10.regularexpressions;

public class InvalidInputException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7974444241527588673L;
	private String errorMessage;
	
	public InvalidInputException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}
