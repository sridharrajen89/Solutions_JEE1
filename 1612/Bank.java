package com.htc.week1;

import com.htc.week1.BankAccount;

public class Bank {

	static private int lastassignedNo=0;
	private BankAccount[] accounts;
	
	public BankAccount[] getAccounts() {
		return accounts;
	}
	
	public void setAccounts(BankAccount[] accounts) {
		this.accounts= accounts;
	}
	
	public static int getLastAssignedNo() {
	return lastassignedNo++;
	}

}
