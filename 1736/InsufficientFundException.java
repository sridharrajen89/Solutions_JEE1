package com.htcinc.oops.day8;

@SuppressWarnings("serial")
public class InsufficientFundException extends Exception {
	private String errorMessage="Not enough funds for withdrawal.";
	
	public String getErrorMessage() {
		return this.errorMessage;
	}

}
