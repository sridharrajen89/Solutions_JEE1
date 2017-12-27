package com.java.training.exercise5and6.bankoperations;

public interface IBankServiceProvider {
	
	public BankAccount checkAccount(String accountNo);
	public double getBalance( BankAccount account) throws InsufficientFundException;
	public boolean depositMoney(BankAccount account, double amount)throws InvalidAmountException;
	public boolean withdrawMoney(BankAccount account, double amount) throws InsufficientFundException;
	public  boolean transferMoney(BankAccount fromAccount, BankAccount  toAccount,double amount)throws InsufficientFundException;
	

}
