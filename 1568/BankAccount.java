package com.htcinc.weekone;

public class BankAccount
{
 
	private double balance = 1000;
	private String accountName;
	private int accountNumber;
 
	//default constructor
	public BankAccount(int num, String owner)
	{
		this.accountNumber = num;
		this.accountName = owner;
	}
 
	//default constructor
		public BankAccount(int num, String owner, double bal)
		{
			this.accountNumber = num;
			this.accountName = owner;
			this.balance = bal;
			
		} 
	public double getBalance()
	{
		return balance;
	}
 
	public String getOwner()
	{
		return accountName;
	}
 
	public int getAccountNumber()
	{
		return accountNumber;
	}
 
	public void setBalance(double newBalance)
	{
		balance = newBalance;
	}
 
	public void setAccountNumber(int newAccountNumber)
	{
		accountNumber = newAccountNumber;
	}
	  void display(){
		  System.out.println("Account Details :"+accountNumber+" "+accountName+" "+balance);
	  }  
	  
	public static void main(String args[]){  
		BankAccount s1 = new BankAccount(111,"sree");  
		BankAccount s2 = new BankAccount(112,"ram",5555.0); 
	    s1.display();  
	    s1.getBalance(); 
	    s2.display();  
	    
}

}
