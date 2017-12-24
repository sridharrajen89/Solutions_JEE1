package com.java.exercise;

import java.util.Arrays;

public class Bank implements IBankServiceProvider{
	BankAccount[] ba;
	static int lastAssignedNo =0;
	
	//constructor
	public Bank(BankAccount[] ba) {
		super();
		this.ba = ba;
	}
	
	//Getter and Setter
	public BankAccount[] getBr() {
		return ba;
	}
	public void setBr(BankAccount[] ba) {
		this.ba = ba;
	}
	public static int getLastAssignedNo() {
		return lastAssignedNo;
	}
	public static void setLastAssignedNo(int lastAssignedNo) {
		Bank.lastAssignedNo = lastAssignedNo;
	}

	//toString()
	@Override
	public String toString() {
		return "Bank [ba=" + Arrays.toString(ba) + "]";
	}
	
	@Override
	public BankAccount checkAccount(String accountNo){
		//boolean flag = false;
		for(int i=0;i<=ba.length;i++)
		{
			if(ba[i].getAccountNo()==accountNo) {
				//flag=true;
				return ba[i];}
		}
		return null;
	}
	
	@Override
	public double getBalance(BankAccount account)  throws  InSufficientFundException
	{
		BankAccount b = checkAccount(account.accountNo);
		if(b.getBalance()<1000)
		{
			throw new InSufficientFundException();
		}
		return b.getBalance();
	}
	
	@Override
	public boolean depositMoney(BankAccount account,double amount) throws InvalidAmountException
	{
			if(Double.valueOf(amount)<0)
		{
			throw new InvalidAmountException();
		}
		BankAccount b = checkAccount(account.accountNo);
		double balance = b.getBalance();
		b.setBalance(balance+amount);
		return true;
	}
	
	@Override
	public boolean withdrawMoney(BankAccount account,double amount) throws InvalidAmountException
	{
		if(Double.valueOf(amount)<0)
		{
			throw new InvalidAmountException();
		}
		BankAccount b = checkAccount(account.accountNo);
		double balance = b.getBalance();
		b.setBalance(balance-amount);
		return true;
	}
	
	@Override
	public boolean transferMoney(BankAccount fromAccount,BankAccount toAccount , double amount ) throws InvalidAmountException
	{
		if(Double.valueOf(amount)<0)
		{
			throw new InvalidAmountException();
		}
		BankAccount b = checkAccount(fromAccount.accountNo);
		BankAccount b1 = checkAccount(toAccount.accountNo);
		double bal1 = b.getBalance();
		double bal2 = b1.getBalance();
		b1.setBalance(bal2+amount);
		b.setBalance(bal1-amount);
		return true;
	}

}
