package com.java.training.exercise5and6.bankoperations;

public class InsufficientFundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1930318780143570670L;
	/**
	 * 
	 */
	private String errorMessage;

	public InsufficientFundException(String errorMessage) {
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
