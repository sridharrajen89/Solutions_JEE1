package com.htc.oops;

public class BankAccount extends Object{
	
	private String accountNo;

	private String accountName;

	private int balance;

	// default constructor 

		public BankAccount(){

			accountNo=" ";

			accountName=" ";

			balance=0;

			
		}

		// overloaded constructor 

		public BankAccount(String accountNo, String accountName) 
		{

			super();

			this.accountNo = accountNo;

			this.accountName = accountName;

			balance = 1000;
			
		}

		@Override

		public String toString() {

			return "BankAccount [accountNO....=" + accountNo + ", accountName****=" + accountName + ", balance=" + balance + "]";
		}
}
