package test.com;
import java.util.*;

//Interface for Bank operations
	interface IBankServiceProvider{
		
		public Bank checkAccount(String accountNO);
		public double getBalance(Bank acctobj);
		public boolean depositMoney(Bank acctobj,double amount);
		public boolean withdrawMoney(Bank acctobj,double amount);
		public boolean transferMoney(Bank fromacctobj,Bank toacctobj);
					
	}

public class Bank implements IBankServiceProvider {
	
	int[] accountNO;
	static int lastAssignedNo=0;

	public void Createnewaccount() {
		
		int i=0;
		
		for (i=0;i<accountNO.length;i++) {
			
				Bank.lastAssignedNo=accountNO[i];
							
			}
	/*	accountNO[accountNO.length+1]=Bank.lastAssignedNo+1;*/
		
		}
					
	
//default constructor
	
	public Bank() {
		this.accountNO=null;
}
	
	
//overloaded constructor 
	
	public Bank(int[] accountNO) {
		super();
		this.accountNO = accountNO;
	}

//getters and setters

	public int[] getAccountNO() {
		return accountNO;
	}

	public void setAccountNO(int[] accountNO) {
		this.accountNO = accountNO;
	}

//tostring method
	@Override
	public String toString() {
		return "Bank [accountNO=" + accountNO + "]";
	}


	@Override
	public Bank checkAccount(String accountNO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getBalance(Bank acctobj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean depositMoney(Bank acctobj, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean withdrawMoney(Bank acctobj, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean transferMoney(Bank fromacctobj, Bank toacctobj) {
		// TODO Auto-generated method stub
		return false;
	}
	

	
	
}
