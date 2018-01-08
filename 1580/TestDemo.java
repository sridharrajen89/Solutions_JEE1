package com.htc.myjava;
import java.util.*;

public class TestDemo {

	public static void main(String[] args)
	{
		int age;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Enter the age : ");
		age=inputDevice.nextInt();
		if(age>=18 && age <=35)
		{
		System.out.println("age is between 18 to 35");
		}
		else if(age>35)
			
		{
			System.out.println("over 35");	
		}
		System.out.println("End of program");
	}

}


/*
 * DATA TYPES
 ASCII
ISO 8859-1
KO1-8
GB18030
UNICODE SYSTEM - contains two byes
LOWEST VALUE= '\U0000'
HIGHEST VALUE='\UFFFF'
*/