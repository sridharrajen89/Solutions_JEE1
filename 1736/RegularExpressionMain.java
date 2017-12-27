package com.htcinc.oops.day10;

import java.util.regex.Pattern;

/*
 10. Validate the input with regular expressions. 
     a. Email-ID      
     b. Password      
     c. Credit-card Number
 */

public class RegularExpressionMain {

	public static String emailId;
	public static String password;
	public static String ccNumber;
	
	public static void main(String[] args) {
		
		ccNumber="1234-1234-1234-1234";
		emailId="abc@bcd.com";
		password="abc123_#$A";
		System.out.println("Email validation : \n Input : " + emailId + " \n Output : " + (RegularExpressionMain.validateEmailId(emailId)?"Valid format":"Invalid format"));
		System.out.println("Password validation : \n Input : " + password + " \n Output : " + (RegularExpressionMain.validatePassword(password)?"Valid format":"Invalid format"));		
		System.out.println("CC validation : \n Input : " + ccNumber + " \n Output : " + (RegularExpressionMain.validateCreditCardNumber(ccNumber)?"Valid format":"Invalid format"));

		
	}
	
	
	public static boolean validateEmailId(String emailId) {
		
		return Pattern.matches("[a-zA-Z0-9-_.]{3,20}@{1}[a-zA-Z]{2,10}[.]{1}[cCiI][oOnN][mM]",emailId);
		

	}
	
	public static boolean validatePassword(String pwd) {
		
		//return Pattern.matches("[a-z]{1,10}[A-Z]{1,10}[0-9]{1,10}[-_#$]{1,9}",pwd);
		return Pattern.matches("\\A(?=\\S*?[0-9])(?=\\S*?[a-z])(?=\\S*?[A-Z])(?=\\S*?[@#$%^&+=])\\S{8,}\\z",pwd);
		//return Pattern.matches("[a-zA-Z0-9_-#$]{5,12}",pwd);
	}
	
	public static boolean validateCreditCardNumber(String ccNumber) {
		
		return Pattern.matches("[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}",ccNumber);
	}
	

}
