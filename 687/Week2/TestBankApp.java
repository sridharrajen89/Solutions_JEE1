/**
 * Ex 5 - Create a Bank Class
 * Ex 6 -  user defined exceptions - InsufficientFundException and InvalidAmountException 
 */
package com.test;
import java.io.*;
import java.util.Arrays;


/**
 * @author Radhika
 *
 */

class BankApp implements Serializable, IBankServiceProvider{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BankAccount myBankAccount[] = new BankAccount[5];
	/**
	 * @param myBankAccount
	 */
	public BankApp(BankAccount[] myBankAccount) {
		super();
		this.myBankAccount = myBankAccount;
	}
	/**
	 * 
	 */
	public BankApp() {
		super();
		this.myBankAccount = null;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(myBankAccount);
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
		BankApp other = (BankApp) obj;
		if (!Arrays.equals(myBankAccount, other.myBankAccount))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bank [myBankAccount=" + Arrays.toString(myBankAccount) + "]";
	}
	/**
	 * @return the myBankAccount
	 */
	public BankAccount[] getmyBankAccount() {
		return myBankAccount;
	}
	/**
	 * @param myBankAccount the myBankAccount to set
	 */
	public void setMyBankAccount(BankAccount[] myBankAccount) {
		this.myBankAccount = myBankAccount;
	}
	
	public BankAccount checkAccount(int accountNo) throws AccountNotFoundException{
		for (BankAccount ba: myBankAccount) 
			if (ba.getAccountNo() == accountNo)
				return ba;
		throw new AccountNotFoundException();
	}
	
	public double getBalance(BankAccount account) throws AccountNotFoundException{
		BankAccount ba;
		ba = checkAccount (account.getAccountNo());
		if (ba != null)
			return ba.getBalance();
		else	
		   return 0;
	}
	
	public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException, AccountNotFoundException{
		BankAccount ba;
		if (amount > 0) {
			ba = checkAccount (account.getAccountNo());
			if (ba != null) {
				ba.setBalance(ba.getBalance()+amount);
				return true;
			}
			else	
				return false;
		}
		else throw new InvalidAmountException ();
	}
	
	public boolean withdrawMoney(BankAccount account, double amount) throws InsufficientFundException, InvalidAmountException, AccountNotFoundException{
		BankAccount ba;
		if (amount > 0) {
			ba = checkAccount (account.getAccountNo());
			if (ba != null) {
				if (ba.getBalance() >= amount) {
					ba.setBalance(ba.getBalance()-amount);
					return true;
				}
				else
					throw new InsufficientFundException ("Not enough money. Ask Santa!!");
			}
			else	
				return false;
		}
		else throw new InvalidAmountException ();
	}
	
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) throws InsufficientFundException, InvalidAmountException, AccountNotFoundException{
		BankAccount baf, bat;
		if (amount > 0) {
			baf = checkAccount (fromAccount.getAccountNo());
			bat = checkAccount (toAccount.getAccountNo());
			if (baf != null && bat != null) {
				if (baf.getBalance() >= amount) {
					baf.setBalance(baf.getBalance()-amount);
					bat.setBalance(bat.getBalance()+amount);
					return true;
				}
				else
					throw new InsufficientFundException ("Not enough money. Ask another friend!!");
			}
			else	
				return false;
		}
		else throw new InvalidAmountException ();
	}
}

// Bank Transactions Interface
interface IBankServiceProvider {
	public BankAccount checkAccount(int accountNo) throws AccountNotFoundException;
	public double getBalance(BankAccount account) throws AccountNotFoundException;
    public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException, AccountNotFoundException;
	public boolean withdrawMoney(BankAccount account, double amount) throws InsufficientFundException, InvalidAmountException, AccountNotFoundException;
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount)throws InsufficientFundException, InvalidAmountException, AccountNotFoundException;
}

// User defined exceptions

class InsufficientFundException extends Exception{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String errorMessage;
    
	/**
	 * @param errorMessage
	 */
	public InsufficientFundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
  
}

class InvalidAmountException extends Exception{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    final String ERRORMESSAGE="Invalid Amount, enter Amount > 0";
	/**
	 * @return the eRRORMESSAGE
	 */
	public String getERRORMESSAGE() {
		return ERRORMESSAGE;
	}
	
}

class AccountNotFoundException extends Exception{
	  /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	    final String ERRORMESSAGE="Account Does not exist!!!";
		/**
		 * @return the eRRORMESSAGE
		 */
		public String getERRORMESSAGE() {
			return ERRORMESSAGE;
		}	
}

public class TestBankApp {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Bank Application");
		
		BankAccount personalBankAccount []= new BankAccount [5];
		int accountNo=1;
		
		personalBankAccount [0] = new BankAccount("Frank",5000);
		personalBankAccount [1] = new BankAccount("Gayathri",6000);
		personalBankAccount [2] = new BankAccount("Hema",7000);
		personalBankAccount [3] = new BankAccount("Isaac",8000);
		personalBankAccount [4] = new BankAccount("Jayalalitha",9000);
		
		BankApp newBankApp = new BankApp ();
		
		newBankApp.setMyBankAccount(personalBankAccount);
		
		try{
			System.out.println(newBankApp);
			System.out.println(newBankApp.getBalance(personalBankAccount[2]));
			System.out.println("Money Deposited? " + newBankApp.depositMoney(personalBankAccount[1],3000));
			System.out.println("Balance after Deposit: " + newBankApp.getBalance(personalBankAccount[1]));
			System.out.println("Money Withdrawn? " + newBankApp.withdrawMoney(personalBankAccount[0],3000));
			System.out.println("Balance after withdrawal: " + newBankApp.getBalance(personalBankAccount[0]));
			System.out.println("Balance before Transfer: " + newBankApp.getBalance(personalBankAccount[3]) + "-> " + newBankApp.getBalance(personalBankAccount[4]));
			System.out.println("Money Transferred? " + newBankApp.transferMoney(personalBankAccount[3],personalBankAccount[4],4000));
			System.out.println("Balance after Transfer: " + newBankApp.getBalance(personalBankAccount[3]) + "-> " + newBankApp.getBalance(personalBankAccount[4]));
			System.out.println(newBankApp.checkAccount(6));
		}
		catch (AccountNotFoundException IAE) {
			System.out.println(IAE.ERRORMESSAGE);
		}
		catch (InvalidAmountException IAE) {
			System.out.println(IAE.ERRORMESSAGE);
		}
		catch (InsufficientFundException ISFE) {
			System.out.println("InsufficientFundException: " + ISFE.getCause());
		}	
		
	}

}
