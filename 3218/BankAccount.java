package com.htc.training;

public class BankAccount {

	String accountNo;
	String accountName;
	double balance;
	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static void main(String[] args) {
	BankAccount b = new BankAccount("AXIS00001","Suresh Uttarala");
	b.setBalance(1000);

	}

}
