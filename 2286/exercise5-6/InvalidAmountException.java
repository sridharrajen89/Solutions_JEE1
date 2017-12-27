package com.java.training.exercise5and6.bankoperations;

public class InvalidAmountException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5389440220608345460L;
	private String errorMessage;

	public InvalidAmountException(String errorMessage) {
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

