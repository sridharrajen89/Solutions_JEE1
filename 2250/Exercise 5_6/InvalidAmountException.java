package com.java.exercise;

public class InvalidAmountException extends Exception {
	private String errorMessage = "Amount not valid";

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}
