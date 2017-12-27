package com.htc.exercise456;

public class InsufficientFundException extends Exception {
	private String errorMessage;
	
	public InsufficientFundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	 
}
