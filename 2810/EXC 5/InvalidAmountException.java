package com.htc.Exc2;

public class InvalidAmountException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errormsg;

	public InvalidAmountException(String errormsg) {
		super();
		this.errormsg = errormsg;
	}

	public String getErrormsg() {
		return errormsg;
	}

	@Override
	public String toString() {
		return "InvalidAmountException [errormsg=" + errormsg + "]";
	}

}