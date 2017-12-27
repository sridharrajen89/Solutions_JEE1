package com.htc.Exc2;

public class InsufficientFundException extends Exception {
	private String errormsg;

	public InsufficientFundException(String errormsg) {
		super();
		this.errormsg = errormsg;
	}

	public String getErrormsg() {
		return errormsg;
	}

	@Override
	public String toString() {
		return "InsufficientFundException [errormsg=" + errormsg + "]";
	}


}