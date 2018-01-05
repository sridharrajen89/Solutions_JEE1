package com.htc.Exc2;

public class EmployeeNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errormsg;
	
	public EmployeeNotFoundException(String errormsg) {
		super();
		this.errormsg = errormsg;
	}

	public String getError() {
		return errormsg;
	}

	@Override
	public String toString() {
		return "EmployeeNotFoundException [error=" + errormsg + "]";
	}
}
