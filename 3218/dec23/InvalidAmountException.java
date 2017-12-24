package com.htc.dec23;

public class InvalidAmountException extends Exception 
{
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage
	 */
	public InvalidAmountException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	

}
