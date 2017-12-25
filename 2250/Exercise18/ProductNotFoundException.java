package com.java.exercise2;

public class ProductNotFoundException extends Exception{
	 private final String ERRORMESSAGE = "Product not found in store";

//Getter
	public String getERRORMESSAGE() {
		return ERRORMESSAGE;
	}
}
