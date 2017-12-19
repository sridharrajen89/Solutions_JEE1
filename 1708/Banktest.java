package com.htc.CoreJavaExercise;

public class Banktest {
	public static void main(String[] args) {

		BankAccount axis = new BankAccount();
		axis.getBankAccountNum();
		axis.getBankAccountName();
		axis.getBankAccountBalance();
		axis.setBankAccountName("123R123tt");	
		axis.setBankAccountNum("CR12345");
		
		
		System.out.println(axis.getBankAccountNum()+ " ---> Account Number");
		System.out.println(axis.getBankAccountName()+"--> Account Name ");
	    System .out.println(axis.getBankAccountBalance() + " -- > Account Balance");
	   }
}