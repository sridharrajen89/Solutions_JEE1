package com.htc.ureg;

@SuppressWarnings("serial")
public class InvalidCredintialsException extends Exception{
	private String errorMessage;

	/**
	 * @param errorMessage
	 */
	public InvalidCredintialsException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
