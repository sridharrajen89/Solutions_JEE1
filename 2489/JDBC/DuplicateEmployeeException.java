package com.htc.exe3;

public class DuplicateEmployeeException extends Exception {

	private static final long serialVersionUID = 1L;
	private String errormsg;

	public DuplicateEmployeeException(String errormsg) {
		super();
		this.errormsg = errormsg;
	}

	public String getErrormsg() {
		return errormsg;
	}

	@Override
	public String toString() {
		return "DuplicateEmployeeException [errormsg=" + errormsg + "]";
	}
}
