package com.java.training.exercise5and6.bankoperations;

import java.util.ArrayList;

public class Bank implements IBankServiceProvider {
	


	public static int lastAssignedNo = 0;
	private ArrayList<BankAccount> bankAccountList = new ArrayList<BankAccount>();
	
	
	public Bank() {
		Bank.lastAssignedNo=+1;
	}
	
	public ArrayList<BankAccount> getBankAccountList() {
		return bankAccountList;
	}

	public void setBankAccountList(ArrayList<BankAccount> bankAccountList) {
		this.bankAccountList = bankAccountList;
	}

	@Override
	public BankAccount checkAccount(String accountNo) {
		// Checking Bank account no in the list
		for (BankAccount bankAccount:bankAccountList) {
			//System.out.println(bankAccount.getAccountNo());
			if (bankAccount.getAccountNo().equals(accountNo)) {
				return bankAccount;
			}
		}
		return null;
	}

	@Override
	public double getBalance(BankAccount account){
		// Checking Bank balance for the given bank account
		
		account = checkAccount(account.getAccountNo());
		if (account==null) {
			return 0;
		}
		else {
			return account.getBalance();
		}
		
	}

	@Override
	public boolean depositMoney(BankAccount account, double amount) {
		// Deposit amount into the given bank account
		account = checkAccount(account.getAccountNo());
		if (account == null)
		{
		return false;
		}
		else
		{
			double balance = account.getBalance()+amount;
			account.setBalance(balance);
			bankAccountList.set(Integer.parseInt(account.getAccountNo())-1, account);
			return true;
		}
		
	}

	@Override
	public boolean withdrawMoney(BankAccount account, double amount) throws InsufficientFundException {
		// Withdraw money from the given bank account
		account = checkAccount(account.getAccountNo());
		if (account == null)
		{
			return false;
		}
		else 
		{
			if (account.getBalance()< amount) {
				
				throw new InsufficientFundException("Insufficient Funds");
			} 
			else {
			account.setBalance(account.getBalance()-amount);
			bankAccountList.set(Integer.parseInt(account.getAccountNo())-1, account);
			return true;
		}
	}
		
}

	@Override
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount,double amount) throws InsufficientFundException{
		// Transfer money fromaccount to toaccount
		fromAccount = checkAccount(fromAccount.getAccountNo());
		toAccount = checkAccount(toAccount.getAccountNo());
		if (fromAccount == null || toAccount == null)
		{
			return false;
		}
		else
		{
			//double balance = account.getBalance();
			if (fromAccount.getBalance() >=amount )
			{
				fromAccount.setBalance(fromAccount.getBalance()-amount);
				toAccount.setBalance(toAccount.getBalance()+amount);
				return true;
			}
			else {
				throw new InsufficientFundException("Insufficient Funds");
			}
						
		}
	}

}
