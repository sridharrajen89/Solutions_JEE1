package com.htcinc.oops;
/*
 
 5. Follow the given instructions and create an application using Java.    
 (i) Create a Bank Class having an array of BankAccount as a data member, populate the array through setters. 
 
 (ii) Introduce a static variable called lastAssignedNo(integer). This should be initialized to 0 in the beginning. While creating new bank accounts, the accountNo 
       variable should not be supplied in the constructor parameter list. Instead it has to be computed as (lastAssignedNo + 1). Also modify the 
       lastAssignedNo after creating a bank account. 
 
 (iii) Create an IBankServiceProvider interface and declare the following methods:     
	 (a) BankAccount checkAccount(String accountNo)   
	 This checks whether the given account number is available in the array or not. 
	 If exists, it should return the object of BankAccount class, else   return null. 
	 Reuse this method in all the other methods given below.      
	 (b) double getBalance( BankAccount account)   This will return the balance in an account for the given account      
	 (c) boolean depositMoney(BankAccount account, double amount)   This deposits the given amount into the given account number after   
	 verifying whether the given account is present in the array or not.     
	(d) boolean withdrawMoney(BankAccount account, double amount)   
	This will withdraw the given amount from the given account after   verifying the existence of account as well as balance.      
	(e) boolean transferMoney(BankAccount fromAccount, BankAccount     toAccount amount)   
	This transfers the money from one account to another account after  
	 verifying both the accounts are existing or not as well as balance of the   ‘fromAccount’. 
	 
 (iv) Bank class should implement IBankServiceProvider interface and override the    methods of the interface. 
 
 */

public class Bank {
	
	private BankAccount[] bankAccount;
	private static int lastAssignedNo=0;
	private static int index=0;
	
	public Bank() {
		super();
		
		this.bankAccount = bankAccount;
	}
	

	
	
	
	
	

}
