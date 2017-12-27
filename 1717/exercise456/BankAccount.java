package com.htc.exercise456;

public class BankAccount {
	private String accountNo; 
	private String accountName;
	private double balance;
	
	private static int lastAssignedNo = 0;
	
	public BankAccount(String accountName) {
		super();
		lastAssignedNo = lastAssignedNo + 1;
		this.accountNo = Integer.toString(lastAssignedNo);
		this.accountName = accountName;
		this.balance = 1000;
	}

	public String getAccountNo() {
		return accountNo;
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
}

