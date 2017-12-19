package com.htctraining.exercise1.BankAccount4;

public class BankAccount {

	 String accountNo;
	 String accountName;
	 int balance;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bk = new BankAccount("AZ2134567","Santosh");
		bk.setBalance(1000);
		System.out.println(bk);
	}

	public BankAccount(String accountNo, String accountName, int balance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}

	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + ", balance=" + balance + "]";
	}

}
