package com.htcinc.oops.day8;

public interface IBankServiceProvider {
	
	BankAccount checkAccount(String accountNo);
	double getBalance( BankAccount account);
	boolean depositMoney(BankAccount account, double amount);
	boolean withdrawMoney(BankAccount account, double amount);
	boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) ;

}
