package com.htc.ureg;

@SuppressWarnings("serial")
public class UserNameDuplicatedException extends Exception 
{
	String errorMessage;

	/**
	 * @param errorMessage
	 */
	public UserNameDuplicatedException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
}
