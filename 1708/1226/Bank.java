/**
 * 
 */
package co.htc.CoreJavaExercise2;
import java.util.*;
import java.io.*;
import com.htc.CoreJavaExercise.BankAccount;


/**
 * @author NishantKumar
 *
 */
public class Bank {
	private BankAccount [] bankaccounts;
	private static int lastAssignedNo;
	

	/**
	 * 
	 */
	public Bank() {
		// TODO Auto-generated constructor stub
		super();
		this.bankaccounts = null;
		lastAssignedNo = 0;
		
	}

	public boolean addBankAccount(BankAccount bankAccount) {
		bankaccounts[lastAssignedNo++]=bankAccount;
		return true;
	}

	

	
	@Override
	public String toString() {
		return "Bank [bankAccount=" + Arrays.toString(bankaccounts) + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(bankaccounts);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		if (!Arrays.equals(bankaccounts, other.bankaccounts))
			return false;
		return true;
	}

public BankAccount checkAccount(String bankAccountNum) {
		// TODO Auto-generated method stub
		for(BankAccount bAccount: bankaccounts ) {
			if ((bAccount.getBankAccountNum()).equals(bankAccountNum))
				return bAccount;	
		}
		return null;
	}

public double getBalance(BankAccount account) {
		// TODO Auto-generated method stub
		BankAccount bAccount=checkAccount(account.getBankAccountNum());
		if (bAccount != null)
			return bAccount.getBankAccountBalance();
		else
			return 0;
	}
	
	public boolean depositMoney(BankAccount account, double amount) {
		// TODO Auto-generated method stub
		
		 if (amount > 0) {
			BankAccount bAccount=checkAccount(account.getBankAccountNum());
			if (bAccount != null) {
				bAccount.setBankBalnce(bAccount.getBankAccountBalance() + amount);
				return true;
			}
		 }
			return false;
		
	}


	public boolean withdrawMoney(BankAccount account, double amount) {
		// TODO Auto-generated method stub
		 if (amount > 0) {
			BankAccount bAccount=checkAccount(account.getBankAccountNum());
			if (bAccount != null) {
				bAccount.setBankBalnce(bAccount.getBankAccountBalance() - amount);
				return true;
			}
		 }
			return false;
		
	}


	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) {
		// TODO Auto-generated method stub
		
		 if (amount > 0) {
			BankAccount fromBankAccount=checkAccount(fromAccount.getBankAccountNum());
			BankAccount toBankAccount=checkAccount(toAccount.getBankAccountNum());
			
			if ((fromBankAccount != null)  && (toBankAccount != null)) {
				
				fromBankAccount.setBankBalnce(fromBankAccount.getBankAccountBalance() - amount);
				toBankAccount.setBankBalnce(toBankAccount.getBankAccountBalance() + amount);
				return true;
			}
		 }
			return false;
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
		  final String ERRORMESSAGE="Account Does not exist!!!";
			/**
			 * @return the eRRORMESSAGE
			 */
			public String getERRORMESSAGE() {
				return ERRORMESSAGE;
			}	
	}	
	
}

