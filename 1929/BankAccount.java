package com.htc.week1;

public class BankAccount {

	String acountNo;
	String accountName;
	int balance=1000;
	
	public BankAccount(String acountNo, String accountName) {
		super();
		this.acountNo = acountNo;
		this.accountName = accountName;
	}


	public BankAccount(String[] strings, String accountName2) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "BankAccount [acountNo=" + acountNo + ", accountName=" + accountName + ", balance= "+balance+"]";
	}



}
