package com.htc.corejava.trainingexcerise.week1;

public class Bank extends BankAccount implements IBankServiceProvider{

	public BankAccount[] bankAcc;
	private static int lastAssignedNo = 0;
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	public Bank(BankAccount[] bankAccInp) {
		super();
		this.bankAcc = bankAccInp;
		lastAssignedNo = lastAssignedNo + bankAccInp.length;
	}
	@Override
	public BankAccount checkAccount(String accountNo) {
		// TODO Auto-generated method stub
		int found = 0,i = 0;
		for(i=0; i<bankAcc.length; i++) {
			if (bankAcc[i].accountNo == accountNo) {
				found = 1;
				break;
			}
		}
		if (found == 1)
			return bankAcc[i];
		else
			return null;
	}
	@Override
	public double getBalance(BankAccount account) {
		// TODO Auto-generated method stub
		BankAccount ba = checkAccount(account.accountNo);
		if(ba!= null)
			return ba.accountBalance;
		else
			return 0;
	}
	@Override
	public boolean depositMoney(BankAccount account, double amount) {
		// TODO Auto-generated method stub
		BankAccount ba = checkAccount(account.accountNo);
		if(ba!= null) {
			ba.accountBalance = ba.accountBalance+amount;
			return true;
		}
		else
			return false;
	}
	@Override
	public boolean withdrawMoney(BankAccount account, double amount) {
		// TODO Auto-generated method stub
		BankAccount ba = checkAccount(account.accountNo);
		if(ba!= null & (ba.accountBalance-amount)>=0) {
			ba.accountBalance = ba.accountBalance-amount;
			return true;
		}
		else
			return false;	
	}
	@Override
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) {
		// TODO Auto-generated method stub
		BankAccount bfa = checkAccount(fromAccount.accountNo);
		BankAccount bta = checkAccount(toAccount.accountNo);
		if(bfa!= null & bta!= null & (bfa.accountBalance-amount>=0)) {
			bfa.accountBalance = bfa.accountBalance-amount;
			bta.accountBalance = bta.accountBalance+amount;
			return true;
		}
		else
			return false;
	}
}