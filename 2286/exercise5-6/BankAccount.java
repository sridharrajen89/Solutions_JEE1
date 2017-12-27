package com.java.training.exercise5and6.bankoperations;

public class BankAccount {
	private String accountNo;
	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	private String accountName;
	private double balance;

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
