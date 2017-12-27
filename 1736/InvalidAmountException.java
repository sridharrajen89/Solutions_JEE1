package com.htcinc.oops.day8;

@SuppressWarnings("serial")
public class InvalidAmountException extends Exception {
	private String errorMessage;
	
	public InvalidAmountException() {
		this.errorMessage="Invalid amount. Please enter a valid transaction";
	}
	
	public String getErrorMessage() {
		return this.errorMessage;
	}

}
