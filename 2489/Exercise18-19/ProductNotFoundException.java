package com.htc.exe2;

public class ProductNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errormsg;
	
	public ProductNotFoundException(String errormsg) {
		super();
		this.errormsg = errormsg;
	}

	public String getErrormsg() {
		return errormsg;
	}

	@Override
	public String toString() {
		return "ProductNotFoundException [errormsg=" + errormsg + "]";
	}
}
