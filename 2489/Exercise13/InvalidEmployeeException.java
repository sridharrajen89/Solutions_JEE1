package com.htc.exe2;

public class InvalidEmployeeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errormsg;

	public InvalidEmployeeException(String errormsg) {
		super();
		this.errormsg = errormsg;
	}

	public String getErrormsg() {
		return errormsg;
	}

	@Override
	public String toString() {
		return "InvalidEmployeeException [errormsg=" + errormsg + "]";
	}
}
