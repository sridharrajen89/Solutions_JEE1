package com.htcinc.oops.day8;

public class ProductNotFoundException extends Exception {
	private String errorMessage="Product Not Found";

	public String getErrorMessage() {
		return errorMessage;
	}	

}
