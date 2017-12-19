package com.htc.corejava.trainingexcerise.week1;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount[] bankacc = new BankAccount[3];
		bankacc[0] = new BankAccount ("123456789", "Kirankumar Gudipudi");	
		bankacc[1] = new BankAccount ("987654321", "Radhika Nangineni");
		bankacc[2] = new BankAccount ("135792468", "Nithya Gudipudi");
		Bank bank = new Bank(bankacc);
		
		String accNum = "123456789";
		BankAccount isaccexists;
		
		isaccexists = bank.checkAccount(accNum);
		if(isaccexists!= null)
			System.out.println("Account# "+accNum+" exists "+isaccexists.toString());
		else
			System.out.println("Account# "+accNum+" not found..");
		
		double accBalance = bank.getBalance(bankacc[0]);
		if(accBalance!= 0)
			System.out.println("Account# "+bankacc[0].accountNo+" balance is: "+accBalance);
		else
			System.out.println("Account# "+bankacc[0].accountNo+" not found, or account balance is: "+accBalance);
		
		double depAmount = 5000d;
		boolean suceess = bank.depositMoney(bankacc[0],depAmount);
		if(suceess)
			System.out.println("$"+depAmount+" has been deposited in to Account# "+bankacc[0].accountNo+", new balance is: "+bankacc[0].accountBalance);
		else
			System.out.println("Unable to deposit $"+depAmount+ " into Account# "+bankacc[0].accountNo+" as acc# not found");
		
		double wihdrawlAmount = 1000d;
		suceess = bank.withdrawMoney(bankacc[0],wihdrawlAmount);
		if(suceess)
			System.out.println("$"+wihdrawlAmount+" has been withdrawn from Account# "+bankacc[0].accountNo+", new balance is: "+bankacc[0].accountBalance);
		else if (bank.checkAccount(bankacc[0].accountNo) != null)
				System.out.println("Unable to withdraw $"+wihdrawlAmount+ " from Account# "+bankacc[0].accountNo+" because of insufficient funds");
		else
			System.out.println("Unable to withdraw $"+wihdrawlAmount+ " from Account# "+bankacc[0].accountNo+" as acc# not found");
	
		double amount = 1000d;
		suceess = bank.transferMoney(bankacc[0],bankacc[1],amount);
		if(suceess)
			System.out.println("$"+amount+" has been transfered from Account# "+bankacc[0].accountNo+" to "+""+bankacc[1].accountNo+", new balance in from account is: "+bankacc[0].accountBalance+" and new balance in to account is: "+bankacc[1].accountBalance);
		else if (bank.checkAccount(bankacc[0].accountNo) == null)
			System.out.println("Unable to transfer $"+amount+ " from Account# "+bankacc[0].accountNo+" as acc# not found");
		else if (bank.checkAccount(bankacc[1].accountNo) == null)
			System.out.println("Unable to transfer $"+amount+ " to Account# "+bankacc[1].accountNo+" as acc# not found");
		else
			System.out.println("Unable to transfer $"+amount+ " from Account# "+bankacc[0].accountNo+" to "+bankacc[1].accountNo+" because of insufficient funds");
	}
}