package com.java.exercise;

import java.util.Arrays;

public class BankAccount {

	String acctno[] = new String[5];
	String actname;
	float balance = 1000;
	
	public BankAccount(String[] acctno, String actname) {
		super();
		this.acctno = acctno;
		this.actname = actname;
	}

	@Override
	public String toString() {
		return "BankAccount [acctno=" + Arrays.toString(acctno) + ", actname=" + actname + ", balance=" + balance + "]";
	}
	
}
