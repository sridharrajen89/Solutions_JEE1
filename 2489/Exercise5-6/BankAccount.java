package com.htc.exe1;

public class BankAccount {

	private String accountNo;
	private String accountName;
	private double balance = 0;
	
	
	public BankAccount(String accountNo, String accountName, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}

	public BankAccount() {
		accountNo = " ";
		accountName = " ";
		balance = 0;
	}

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

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountName == null) ? 0 : accountName.hashCode());
		result = prime * result + ((accountNo == null) ? 0 : accountNo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountName == null) {
			if (other.accountName != null)
				return false;
		} else if (!accountName.equals(other.accountName))
			return false;
		if (accountNo == null) {
			if (other.accountNo != null)
				return false;
		} else if (!accountNo.equals(other.accountNo))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + ", balance=" + balance + "]";
	}
	
}
