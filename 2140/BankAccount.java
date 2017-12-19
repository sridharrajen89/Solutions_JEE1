package com.htc.corejava.trainingexcerise.week1;

public class BankAccount {

	public String accountNo;
	public String accountName;
	public double accountBalance;
	public BankAccount() {
		// TODO Auto-generated constructor stub
		accountNo = "NULL";
		accountName = "NULL";
		accountBalance = 0l;
	}
	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.accountBalance = 1000d;
	}
	@Override
	public String toString() {
		return "BankAccountDetails [accountNo=" + accountNo + ", accountName=" + accountName + ", accountBalance="
				+ accountBalance + "]";
	}
}