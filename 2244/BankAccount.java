package com.htc.javaweek1;

public class BankAccount {
	private String accountNo;
	private String accountName;
	private int balance=1000;
	
	//Overloaded Constructor
		public BankAccount(String accountNo, String accountName) {
			super();
			System.out.println("overloaded Constructor is fired.. "+"Acc No: "+accountNo+" Acc Name: "+accountName+" Balance " +balance);
			this.accountNo = accountNo;
			this.accountName = accountName;			
		}
}
