package com.htc.exe1;

public class RegularExpressionTest {
	
	public static void main(String[] args) {
		
		RegularExpresssion re = new RegularExpresssion();
		System.out.println(re.emailValidation("Pradeep.jambukolam@gmail.com"));
		System.out.println(re.passwordValidation("appu$321"));
		System.out.println(re.creditCardValidation(1234567890));
	}

}
