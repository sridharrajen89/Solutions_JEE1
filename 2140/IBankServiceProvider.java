package com.htc.corejava.trainingexcerise.week1;

public interface IBankServiceProvider {
	public BankAccount checkAccount(String accountNo); 
	public double getBalance( BankAccount account); 
	public boolean depositMoney(BankAccount account, double amount); 
	public boolean withdrawMoney(BankAccount account, double amount);
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount); 
}