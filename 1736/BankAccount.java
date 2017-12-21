package com.htcinc.oops;

/*
 4. Follow the given instructions and create an application using Java.   
 (i) Create a ‘BankAccount’ class with 3 data members, accountNo[use String], accountName and balance.   
 (ii) Overload the BankAccount constructor to accept only accountNo and accountName variables.   
 (iii) Initialize the balance with 1000. 
 */

public class BankAccount {
	private String accountNo;
	private String accountName;
	private double balance;
	

	public BankAccount(String accountNo, String accountName, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}

	public BankAccount(String accountNo, String accountName) {
		this(accountNo, accountName, 1000);
	}

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
	
	
	

}
