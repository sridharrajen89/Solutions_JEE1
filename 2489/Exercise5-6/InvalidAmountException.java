package com.htc.exe1;

public class InvalidAmountException extends Exception {

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
