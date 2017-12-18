package com.htc.exercices;

public class Bank extends BankAccount {
	BankAccount bankAccount[];
	static int lastAssignedNo = 0;

	public BankAccount[] getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount[] bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	public BankAccount createNewAccount(String accountName) {
		int accountNo = lastAssignedNo ++;
		return new BankAccount("PNC"+accountNo,"RAJU");
	}
}
