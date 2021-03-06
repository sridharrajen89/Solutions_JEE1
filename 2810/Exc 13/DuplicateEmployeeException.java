package com.htc.Exc2;

public class DuplicateEmployeeException extends Exception{

	private String errormsg;

	public DuplicateEmployeeException(String errormsg) {
		super();
		this.errormsg = errormsg;
	}

	public String getError() {
		return errormsg;
	}

	@Override
	public String toString() {
		return "DuplicateEmployeeException [error=" + errormsg + "]";
	}
}
