package com.java.exercise;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount(new String[] {"100"},"Java");
		BankAccount ba1 = new BankAccount(new String[] {"200"},"Python");
		System.out.println("Bank account details :"+ ba);
		System.out.println("Bank account details :"+ ba1);
	}
}
