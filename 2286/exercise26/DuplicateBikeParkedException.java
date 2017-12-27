package com.java.training.exercise26.parkedbike;

public class DuplicateBikeParkedException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3666369168707338169L;
	private String errorMessage;

	public DuplicateBikeParkedException(String errorMessage) {
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
