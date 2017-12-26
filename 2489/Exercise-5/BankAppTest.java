package com.htc.exe1;

public class BankAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		 BankAccount bankarray[] = new BankAccount[5];
		 bankarray[0] = new BankAccount("Axis001","Savings", 1000.00);
		 bankarray[1] = new BankAccount("Axis002","Checking",2000.00);
		 bankarray[2] = new BankAccount("Axis003","Savings", 5000.00);
		 bankarray[3] = new BankAccount("Axis004","Checking",9000.00);
		 bankarray[4] = new BankAccount("Axis005","Savings", 7000.00);
		 Bank b1 = new Bank(bankarray);
		 System.out.println("Verify the Account : " + b1.checkAccount("Axis005"));
		 System.out.println("Get Balance : " +b1.getBalance(bankarray[2]));
		 System.out.println("Get Balance : " +b1.getBalance(bankarray[3]));
		 System.out.println("Money Deposit : " +b1.depositMoney(bankarray[3], 3000.00));
		 System.out.println("Get Balance : " +b1.getBalance(bankarray[3]));
		 System.out.println("Money Withdrawl : " +b1.withdrawMoney(bankarray[3], 1000.00));
		 System.out.println("Get Balance : " +b1.getBalance(bankarray[3]));
		 System.out.println("Money Transfer : " +b1.transferMoney(bankarray[2], bankarray[3], 17000.00));
		 System.out.println("Get Balance : " +b1.getBalance(bankarray[2]));
		 System.out.println("Get Balance : " +b1.getBalance(bankarray[3]));
		}
		catch(InsufficientFundException IFE) {
			IFE.printStackTrace();
		}
		catch(Exception E) {
			E.printStackTrace();
		}
		
		 	}
}