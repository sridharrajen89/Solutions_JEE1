package com.register.classes;

public class DuplicateUserException extends Exception {
	

	String errorMsg;

	public DuplicateUserException(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

}
