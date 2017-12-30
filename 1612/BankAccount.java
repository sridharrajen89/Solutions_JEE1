package com.htc.week1;

public class BankAccount {
	private String accountNo;
	private String accountName;
	private double balance;
	
public BankAccount(String accountNo,String accountName, double balance) {
	
	this.accountNo = accountNo;
	this.accountName = accountName;
	this.balance = balance;

}
public BankAccount(String accountNo, String accountName) {
	this(accountNo, accountName, 100000.00);
}

@Override
public String toString() {
	return "BankAccount[accountNo=" +accountNo +", accountName ="  + accountName +" balance=" + balance +"]";
	
}
}
