package com.htc.oops;

import java.io.Serializable;

public class BankAccount implements Serializable {

	private String accountNo;
	private String accountName;
	private float balance;
	
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
		accountNo = "";
		accountName = "";
		balance = 1000;
	}
	
	public BankAccount(String accountNo, String accountName) {
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = 1000;
	}
	
	public static void main(String[] args) {
		BankAccount ba = new BankAccount("axis1000", "Savings" );
		System.out.println("Bank Account Details");
		System.out.println("Account No:   " + ba.accountNo +  "\n" + "Account Name: " + ba.accountName 
				+ "\n" + "Balance:  " + ba.balance );
	}
	
}