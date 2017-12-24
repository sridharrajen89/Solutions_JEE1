package com.java.exercise1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
		
	public static final String EMAILPATTERN = "^[a-zA-Z0-9_%$.]+(\\.[A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)$";
	public static final String PASSWORD = "((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%!]) {8,}$)";
	public static final String CDNumber = "[0-9-]+[0-9-]+[0-9-]+$" ;
	
	public static boolean emailValidator(String emailId)
	{
		Pattern p = Pattern.compile(EMAILPATTERN);
		Matcher m = p.matcher(emailId);
		return m.matches();	
	}
	
	public static boolean passwordValidator(String password)
	{
		Pattern p = Pattern.compile(PASSWORD);
		Matcher m = p.matcher(password);
		return m.matches();	
	}
	
	public static boolean cardNumberValidator(String number)
	{
		Pattern p = Pattern.compile(CDNumber);
		Matcher m = p.matcher(number);
		return m.matches();	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emailaddress : ");
		String emailId = sc.nextLine();
		//String emailId = "abc@gmail.com";	
		System.out.println("Email is valid :" + emailValidator(emailId));
		
		System.out.println("Enter password : ");
		String password = sc.nextLine();
		//String Password = "Qwerty@123";
		System.out.println("Passowrd : " + passwordValidator(password));
		
		System.out.println("Enter CDNumber : ");
		String CDnumber = sc.nextLine();
		//String CDnumber = "123456781234";
		System.out.println("CDNumber : " + cardNumberValidator(CDnumber));
		sc.close();
	}

}
