package com.htc.dec23;

import com.htc.training.BankAccount;

public class Bank implements IBankServiceProvider{
	
	private BankAccount[] bankAc;
		
	public Bank() {
		super();
	}

	/**
	 * @param bankAc
	 */
	public Bank(BankAccount[] bankAc) {
		super();
		this.bankAc = bankAc;
	}

	public BankAccount[] getBankAc() {
		return bankAc;
	}

	public void setBankAc(BankAccount[] bankAc) {
		this.bankAc = bankAc;
	}
	
	public BankAccount BankAccountcheckAccount(String accountNo)
	{
		for(BankAccount b :bankAc)
		{
			if(b.getAccountNo().equals(accountNo))
				return b;
		}
	return null;	
	}
	
	public double getBalance(BankAccount account) throws AccountNotFoundException
	{
		Bank b1 = new Bank(bankAc);
		BankAccount b = b1.BankAccountcheckAccount(account.getAccountNo());
		//System.out.println(b.toString());
		if(b!=null)
		 return b.getBalance();
		else
		 throw new AccountNotFoundException("Account is not found in the list");	
		 	
	}
	
	public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException,AccountNotFoundException
	{
		Bank b1 = new Bank(bankAc);
		BankAccount b = b1.BankAccountcheckAccount(account.getAccountNo());
		if(b!=null)
		{
			if(amount > 0)
			{
		      double bal = b.getBalance();
		      double newbal = bal + amount;
		      b.setBalance(newbal);
		      return true;
			}
			else
				throw new InvalidAmountException("Amount should be greater than Zero");
		}  
		else
		 throw new AccountNotFoundException("Account is not found in the list");
	}
	
	public boolean withdrawMoney(BankAccount account, double amount) throws InsufficientFundException,AccountNotFoundException
	{
		Bank b1 = new Bank(bankAc);
		BankAccount b = b1.BankAccountcheckAccount(account.getAccountNo());
		if(b!=null)
		{
			if(b.getBalance() > 0 && amount <=b.getBalance())
			{
		      double newbal = b.getBalance() - amount;
		      b.setBalance(newbal);
		      return true;
			}
			else
				throw new InsufficientFundException("funds are insufficient");
		}  
		else
		 throw new AccountNotFoundException("Account is not found in the list");
	
	}
	
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount,double amount) throws InsufficientFundException,AccountNotFoundException 
	{
		Bank b1 = new Bank(bankAc);
		BankAccount b = b1.BankAccountcheckAccount(fromAccount.getAccountNo());
		BankAccount b2 = b1.BankAccountcheckAccount(toAccount.getAccountNo());
		if(b!=null & b2!=null)
		{
			if(b.getBalance()>0 && amount<=b.getBalance())
			{
				double fromAccBal = b.getBalance()-amount;
				b.setBalance(fromAccBal);
				double toAccBal = b2.getBalance();
				double toAccNewBal = toAccBal+amount;
				b2.setBalance(toAccNewBal);
				return true;
			}
			else
				throw new InsufficientFundException("funds are insufficient");
		}
		else
			 throw new AccountNotFoundException("Account is not found in the list");
	}
}
