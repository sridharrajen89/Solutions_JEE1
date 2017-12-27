package com.htc.exercise456;

import java.util.*;

interface IBankServiceProvider{
	public BankAccount checkAccount(String accountNo) ;
	public  double getBalance( BankAccount account) ;
	public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException ; 
	public boolean withdrawMoney(BankAccount account, double amount)  throws InvalidAmountException, InsufficientFundException ;
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount,double amount) throws InvalidAmountException, InsufficientFundException;
}


public class Bank implements IBankServiceProvider {
	List<BankAccount> bankAccounts = new ArrayList<BankAccount>();
		
	public Bank() {
		super();
		this.bankAccounts = new ArrayList<BankAccount>();
	}

	public List<BankAccount> getBankAccounts() {
		return this.bankAccounts;
	}

	public void setBankAccounts(List<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	
	public void addBankAccount(BankAccount bankAccount) {
		this.bankAccounts.add(bankAccount);
	}
	
		
	@Override
	public BankAccount checkAccount(String accountNo) {
		for(BankAccount bAcct:this.bankAccounts){  
			if (accountNo.equals(bAcct.getAccountNo())) {
				return bAcct;
			}
		}
		return null;
	}

	@Override
	public double getBalance(BankAccount account) {
		BankAccount bAcct = this.checkAccount(account.getAccountNo());
		if (bAcct != null) {
			return account.getBalance();
		}
		return -1; //indicate account was not found or throw exception?
	}



	@Override
	public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Amount must be greater than 0.");
		}
		BankAccount bAcct = this.checkAccount(account.getAccountNo());
		if (bAcct != null) {
			bAcct.setBalance(bAcct.getBalance() + amount);
			return true;
		}
		return false;

	}

	@Override
	public boolean withdrawMoney(BankAccount account, double amount)  throws InvalidAmountException,InsufficientFundException {
		if (amount <= 0) {
			throw new InvalidAmountException("Amount must be greater than 0.");
		}
		BankAccount bAcct = this.checkAccount(account.getAccountNo());
		if (bAcct != null) {
			double acctBalance = bAcct.getBalance();
			if (acctBalance <amount  ) {
				throw new InsufficientFundException("Unable to withdraw - Not enough funds available!.");
			}
			bAcct.setBalance(bAcct.getBalance() - amount);
			return true;
		}
		return false;
	}



	@Override
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount,double amount) throws InvalidAmountException, InsufficientFundException {
		if (amount <= 0) {
			throw new InvalidAmountException("Amount must be greater than 0.");
		}
		BankAccount acctFrom = checkAccount(fromAccount.getAccountNo());
		BankAccount acctTo = checkAccount(toAccount.getAccountNo());
		double acctBalance = acctFrom.getBalance();
		if (acctBalance <amount  ) {
			throw new InsufficientFundException("Unable to transfer - Not enough funds available!.");
		}
		if (acctFrom != null && acctTo != null) {
			this.withdrawMoney(acctFrom, amount); 
			this.depositMoney(acctTo, amount);
			return true;
		}
		return false;
	}
	
}