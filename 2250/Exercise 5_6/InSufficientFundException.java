package com.java.exercise;

public class InSufficientFundException extends Exception{

	private String errorMessage = "Insufficient fund exception";

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
