package com.java.training.exercise18.product;

public class ProductNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -178583988882832012L;
	private String errorMessage;

	
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ProductNotFoundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	
	
	

}
