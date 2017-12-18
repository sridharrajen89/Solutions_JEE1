package com.java.training;

public class BankAccount {
	private String accountNo;
	private String accountName;
	private int balance;

	public BankAccount(String accountNo, String accountName) {

		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = 1000;

	}


	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount("BA12345","Lucky");
		System.out.println("Bank Account Details");
		System.out.println("Account No:   " + bankAccount.accountNo +  "\n" + "Account Name: " + bankAccount.accountName 
				+ "\n" + "Account Bal:  " + bankAccount.balance );

	}

}
