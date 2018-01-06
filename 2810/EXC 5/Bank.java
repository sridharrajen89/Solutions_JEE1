package com.htc.Exc2;

import java.util.Arrays;

public class Bank implements IBankServiceProvider{
	private BankAccount[] bankAccount;
	//Default constructor 
	
	public Bank() {
	}
	
	//constructor 
	public Bank(BankAccount[] bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}
	
	public BankAccount[] getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount[] bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "Bank [bankAccount=" + Arrays.toString(bankAccount) + "]";
	}

	public int createAccountNO(int lastAssingedNo) {
		lastAssingedNo = lastAssingedNo + 1;
		return lastAssingedNo;
	}
	
	@Override
	public BankAccount checkAccount(String accountNo) {
		// TODO Auto-generated method stub
		
		for (BankAccount ba: bankAccount) {
			if(ba.getAccountNo() == accountNo)
			return ba;
		}
		return null; 
	}

	@Override
	public double getBalance(BankAccount account) {
		// TODO Auto-generated method stub
		if (checkAccount(account.getAccountNo())!= null) 
			return account.getBalance();
		else 
			return 0;
	}

	@Override
	public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException{
		// TODO Auto-generated method stub
		if (amount > 0) {
			if (checkAccount(account.getAccountNo())!= null) {
				account.setBalance(account.getBalance() + amount);
				return true;
			}
			else 
			return false;
		}
		else
		throw new InvalidAmountException("You have entered Invalid amount to deposit"); 
			
	}

	@Override
	public boolean withdrawMoney(BankAccount account, double amount) throws InsufficientFundException, InvalidAmountException{
		// TODO Auto-generated method stub
		if(amount >0) {
			if (getBalance(account) > amount ) {
				account.setBalance(account.getBalance() - amount);
				return true;
			}
			else
			throw new InsufficientFundException("Insuffient amount to withdraw");
		}
		else 
		throw new InvalidAmountException("Invalid amount to withdraw");
	}
		
	@Override
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) throws InsufficientFundException, InvalidAmountException {
		// TODO Auto-generated method stub
		if(amount > 0) {
			if (checkAccount(toAccount.getAccountNo())!= null) {
				if (getBalance(fromAccount) > amount ) {
					toAccount.setBalance(toAccount.getBalance() + amount);
					fromAccount.setBalance(fromAccount.getBalance() - amount);
					return true;
				}
				else 
				throw new InsufficientFundException("Entered amount is not available to transfer");
			}
			else
			return false;
		}
		else
		throw new InvalidAmountException("Invalid amount to transfer");
	}
	
	
}