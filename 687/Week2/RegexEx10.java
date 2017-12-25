/**
 * 
 */
package com.core.java;

import java.util.regex.*;

/**
 * @author Radhika
 *
 */
public class RegexEx10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Email Id validation 
//
//		1) Minimum length of login shd be 10 , maximum length shd be 15 
//		2) shd end with eirther 'm' or 'n'
//		3) '@' ( at symbol ) shd come once
		System.out.println(Pattern.matches("[a-z|A-Z|0-9]{10,15}\\@[a-z|A-Z|0-9]+\\.[a-z|A-Z|0-9]+[m|n]", "jrradhika7@ya.com"));

//		Password validation 
//
//		1) Minimum length should be 8
//		2) shd have a number and a special character
		System.out.println(Pattern.matches("[a-z|A-Z|0-9@!*]{8,}", "Sairam@01"));
		
//		credit card number 
//
//		(4 digit number)-(4 digit number)-(4 digit number)	
		System.out.println(Pattern.matches("[0-9]{4,4}-[0-9]{4,4}-[0-9]{4,4}-[0-9]{4,4}", "1234-5678-9012-3456"));  
		System.out.println(Pattern.matches("[0-9]{4,4}-[0-9]{4,4}-[0-9]{4,4}-[0-9]{4,4}", "1324-5678-9012-"));
		}

}
