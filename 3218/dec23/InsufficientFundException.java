package com.htc.dec23;

public class InsufficientFundException extends Exception 
{
	private String errorMessage;

	/**
	 * @param errorMessage
	 */
	public InsufficientFundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	

}
