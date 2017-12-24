package com.java.exercise;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
			BankAccount[] ba =new BankAccount[10];
			ba[0] = new BankAccount("100","John");
			ba[1] = new BankAccount("200","Mary");
			ba[2] = new BankAccount("300","Tom");
			//Bank object
			Bank b = new Bank(ba);	
		
			String accountNo="300";
			BankAccount bankact = b.checkAccount(accountNo);
			System.out.println("Bank Account exist : " + accountNo );
			System.out.println("Account details :  " + bankact );
			
			System.out.println("Balance before deposit :" + b.getBalance(bankact));
			
			b.depositMoney(bankact, 500);
			System.out.println("Balance after deposit :  " + b.getBalance(bankact) );
			
			b.withdrawMoney(bankact, 300);
			System.out.println("Balance after withdrawal :  " + b.getBalance(bankact));
			
			System.out.println("Balance in fromAccount before transfer : " + b.getBalance(ba[1]));
			System.out.println("Balance in toAccount before transfer : " + b.getBalance(ba[2]));
			b.transferMoney(ba[1], ba[2],300);
			System.out.println("Balance in fromAccount after transfer : " + b.getBalance(ba[1]));
			System.out.println("Balance in toAccount after transfer : " + b.getBalance(ba[2]));
	
		}
		catch(InSufficientFundException ae) {ae.printStackTrace();}
		catch(InvalidAmountException ae) {ae.printStackTrace();}
		catch(Exception e) {e.printStackTrace();}
	finally {
		System.out.println("In Final");
	}
	}
	
}
