package com.htc.Exc2;


	public class BankAccount{

		//Data members
		private String accountNo;
		private String accountName;
		private int balance;
		
		//Default constructor
		public BankAccount() {
			accountNo = "";
			accountName = "";
			balance = 1000;
		}

		//Method overload constructor
		public BankAccount(String accountNo, String accountName) {
			super();
			this.accountNo = accountNo;
			this.accountName = accountName;
			this.balance = 1000;
		}

		//Setters and Getters
		public String getAccountNo() {
			return accountNo;
		}

		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}

		public String getAccountName() {
			return accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

		//toString method override
		@Override
		public String toString() {
			return "BankAccount [AccountNo=" + accountNo + ", AccountName=" + accountName + ", Balance=" + balance + "]";
		}
		
			// TODO Auto-generated method stub
//			BankAccount bankAccount();  
	

	}
