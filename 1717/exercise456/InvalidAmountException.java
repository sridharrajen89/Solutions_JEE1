package com.htc.exercise456;

public class InvalidAmountException extends Exception {
private String errorMessage;
	
	public InvalidAmountException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	 
}
