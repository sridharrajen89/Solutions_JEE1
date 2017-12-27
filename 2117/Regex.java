package com.htc.practice.excecises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("rakbdasjdb@gmail.com");
		if (matcher.matches()) {
			System.out.println("valid");
		}else{
			System.out.println("invalid");
		}
          
		
		/*
		 * The password's first character must be a letter, it must contain at least 4 characters and no more than 15 characters 
		and no characters other than letters, numbers and the underscore may be used
		*/
		String regexPW = "^[a-zA-Z]\\w{3,14}$";
		Pattern patternPW = Pattern.compile(regexPW,Pattern.CASE_INSENSITIVE);
		Matcher matcherPW = patternPW.matcher("sa");
		if (matcherPW.matches()) {
			System.out.println("valid");
		}else{
			System.out.println("The password's first character must be a letter, it must contain at least 4 characters and no more than "
					+ "15 characters and no characters other than letters, numbers and the underscore may be used");
		}
		
          
		
		String regexCC = "^4[0-9]{12}(?:[0-9]{3})?$";
		Pattern patternCC = Pattern.compile(regexCC,Pattern.CASE_INSENSITIVE);
		Matcher matcherCC = patternPW.matcher("4444444444444444");
		if (matcherCC.matches()) {
			System.out.println("valid");
		}else{
			System.out.println("Invalid card number, currently we are using only Master Card");
		}
		
	}

}
