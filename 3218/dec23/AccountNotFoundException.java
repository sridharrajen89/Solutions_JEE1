package com.htc.dec23;

public class AccountNotFoundException extends Exception{
	private String errorMessage;
	/**
	 * @param errorM
	 */
	public AccountNotFoundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
}
