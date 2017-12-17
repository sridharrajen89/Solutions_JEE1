package com.htc.excercise1;

public class MainProgram4 {

	public static void main(String[] args) {
		//Define object with overload constructor
		BankAccount bankAccount1 = new BankAccount("100","Test1");
		System.out.println("overload constructor-->"+bankAccount1);
		
		//Define object with default constructor and set some values
		BankAccount bankAccount2 = new BankAccount();
		bankAccount2.setAccountNo("102");
		bankAccount2.setAccountName("Test2");
		System.out.println("default constructor with setters -->"+bankAccount2);
		
	}

}
