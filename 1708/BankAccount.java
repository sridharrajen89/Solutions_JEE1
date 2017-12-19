package com.htc.CoreJavaExercise;

public class BankAccount extends Object{
private String bankAccountNum;
private String bankAccountName;
private double bankBalnce;
//default constructor;
public BankAccount() {
	bankAccountNum = "";
	bankAccountName = "";
	bankBalnce = 1000.00;
	
 }

//Overload Constructor 
public BankAccount (String bankAccountNum, String bankAccountName, double bankBalnce ) {
	this.bankAccountNum = bankAccountNum;
	this.bankAccountName = bankAccountNum;
	this.bankBalnce = bankBalnce;
}
//setter for bankaccountnum
	public void setBankAccountNum(String bankAccountNum){
    this.bankAccountNum = bankAccountNum;	
	}
	
	//setter for accountname
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}
	//setter for bankBalnce
		public void setBankBalnce(double bankBalnce){
	      this.bankBalnce = bankBalnce;	
		}
		
			
		//getter for account number
		public String getBankAccountNum() {
			return bankAccountNum;
		}
		//getter for account name
		public String getBankAccountName() {
			return bankAccountName;
		}
				
		//getter for account Balance 
		public double getBankAccountBalance() {
			return bankBalnce;
		}
		
}
