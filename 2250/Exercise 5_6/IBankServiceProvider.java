package com.java.exercise;

public interface IBankServiceProvider {
	public BankAccount checkAccount(String accountNo);
	public double getBalance(BankAccount account) throws InSufficientFundException;
	public boolean depositMoney(BankAccount account,double amount) throws InvalidAmountException;
	public boolean withdrawMoney(BankAccount account,double amount) throws InvalidAmountException;
	public boolean transferMoney(BankAccount fromAccount,BankAccount toAccount, double amount ) throws InvalidAmountException;
	

}
