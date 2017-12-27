package com.java.training.exercise10.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
	
	private Pattern emailAddressPtrn = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	private Pattern passwordPtrn = Pattern.compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
	private Pattern creditCardPtrn = Pattern.compile("\"^(?:(?<visa>4[0-9]{12}(?:[0-9]{3})?)|\" +\r\n" + 
			"        \"(?<mastercard>5[1-5][0-9]{14})|\" +\r\n" + 
			"        \"(?<discover>6(?:011|5[0-9]{2})[0-9]{12})|\" +\r\n" + 
			"        \"(?<amex>3[47][0-9]{13}))|\" +\r\n");

	
	//Regex Methods
	
	public String validateEmailAddress(String email) throws InvalidInputException {
		Matcher mtch = emailAddressPtrn.matcher(email);
		if(mtch.matches()){
		
			return "Valid Email Address";
		
		}
		else {
			
		throw new InvalidInputException("Invalid Email Address");
	}
	
}

	public String validatePassword(String password) throws InvalidInputException {
		Matcher mtch = passwordPtrn.matcher(password);
		if(mtch.matches()){
		
			return "Valid Password";
		}
		else {
			
			throw new InvalidInputException("Invalid Password");
		}
	}

	public String validateCreditCardNumber(String ccnumber) throws InvalidInputException {
		Matcher mtch = creditCardPtrn.matcher(ccnumber);
		if(mtch.matches()){
		return "Valid Credit card";
		
		}
		else {
			
		throw new InvalidInputException("Invalid Credit Card Number");
		}
	}

	//Main Method to validate
	
	public static void main(String[] args) {
		
		RegularExpressions regex = new RegularExpressions();
		
		
		try {
			
			System.out.println(regex.validateEmailAddress("a@htc.com"));
			System.out.println(regex.validatePassword("Abcdefgh@123"));
			System.out.println(regex.validateCreditCardNumber("435678652345"));

		} 
		
		catch (InvalidInputException ive) {
			System.out.println(ive.getErrorMessage());
		}
		
	}

}
