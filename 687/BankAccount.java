/**
 * 
 */
package com.test;

/**
 * @author Ramkey_IBM_PC
 * Follow the given instructions and create an application using Java.   
 * (i) Create a ‘BankAccount’ class with 3 data members, accountNo[use String], accountName and balance.   
 * (ii) Overload the BankAccount constructor to accept only accountNo and     accountName variables.   
 * (iii) Initialize the balance with 1000. 
 */
public class BankAccount {
	private String accountNo; /* mentioned to use String */
	private String accountName;
	private double balance;
	
	/**
	 * Default Constructor
	 */
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
		this.accountNo = " ";
		this.accountName = " ";
		this.balance = 0;
	}

	/**
	 * Overloaded Constructor
	 * @param accountNo
	 * @param accountName
	 * @param balance
	 */
	public BankAccount(String accountNo, String accountName, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}

	/**
	 * Overloaded Constructor
	 * @param accountNo
	 * @param accountName
	 * @param balance
	 */
	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = 1000;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNo == null) ? 0 : accountNo.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountNo == null) {
			if (other.accountNo != null)
				return false;
		} else if (!accountNo.equals(other.accountNo))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + ", balance=" + balance + "]";
	}

	/**
	 * @return the accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}

	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		BankAccount personalBankAccount = new BankAccount ("001","Test");
		
		System.out.println(personalBankAccount.getAccountNo());
		System.out.println(personalBankAccount.getAccountName());
        System.out.println(personalBankAccount.getBalance());
	}
}
