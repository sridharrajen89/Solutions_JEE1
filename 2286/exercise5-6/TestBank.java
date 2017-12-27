package com.java.training.exercise5and6.bankoperations;

import java.util.ArrayList;

public class TestBank {

	public static void main(String[] args) {
		// Test Bank class
		int lastAssignedNo =Bank.lastAssignedNo+1;
		//Bank.lastAssignedNo =+1;
		BankAccount bankAccountFrom = new BankAccount(Integer.toString(lastAssignedNo),"BankAccountFrom");
		BankAccount bankAccountTo = new BankAccount(Integer.toString(lastAssignedNo+1),"BankAccountTo");
		BankAccount bankAccountAdd = new BankAccount(Integer.toString(lastAssignedNo+2),"BankAccountAdd");
		Bank.lastAssignedNo = 2;
		Bank bank = new Bank();
		ArrayList<BankAccount> bankAccountList = new ArrayList<BankAccount>();
		bankAccountList.add(bankAccountFrom);
		bankAccountList.add(bankAccountTo);
		bankAccountList.add(bankAccountAdd);
		bank.setBankAccountList(bankAccountList);
		try
		{
		System.out.println(bankAccountList.get(0).getBalance());
		Boolean bankDeposit = bank.depositMoney(bankAccountFrom, 500);
		System.out.println(bankAccountList.get(0).getBalance());
		bankDeposit = bank.withdrawMoney(bankAccountFrom, 600);
		System.out.println(bankAccountList.get(0).getBalance());
		bankDeposit = bank.transferMoney(bankAccountFrom, bankAccountTo, 500);
		System.out.println(bankAccountList.get(0).getBalance());
		System.out.println(bankAccountList.get(1).getBalance());
		}
		catch (InsufficientFundException ife)
		{
			System.out.println(ife.getErrorMessage());
		}
			
		
	}

}
