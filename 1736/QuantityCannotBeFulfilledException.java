package com.htcinc.oops.day8;

public class QuantityCannotBeFulfilledException extends Exception {
	private String errorMessage;
	
	public QuantityCannotBeFulfilledException(String errMessage) {
		this.errorMessage=errMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
}
