package com.htc.myjava;

import java.util.Scanner;

public class CaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Enter Age  : ");
		age=inputDevice.nextInt();
		switch (age)
		{
			case 18:
			System.out.println("Age is 18");
			break;  // break is need to stop the execution after above match
			case 19:
			System.out.println("Age is 19");
			break;
			default:
			System.out.println("not matched");
			break;
		}

	}

}
