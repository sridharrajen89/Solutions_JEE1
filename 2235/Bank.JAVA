Package com.htcinc.oops;

import java.io.Serializable;
import java.util.Arrays;

// Entity Bank class
public class Bank implements Serializable, IBankServiceProvider {

	
	private BankAccount[] bankAccounts;
	private static int lastAssignedNo;
	
	public Bank() {
		super();
		this.bankAccounts=null;
		lastAssignedNo=0;
	}
	
	

	public boolean addBankAccount(BankAccount bankAccount) {
		bankAccounts[lastAssignedNo++]=bankAccount;
		return true;
	}

	

	
	@Override
	public String toString() {
		return "Bank [bankAccount=" + Arrays.toString(bankAccounts) + "]";
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(bankAccounts);
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
		if (!Arrays.equals(bankAccounts, other.bankAccounts))
			return false;
		return true;
	}

	@Override
	public BankAccount checkAccount(String accountNo) {
		// TODO Auto-generated method stub
		for(BankAccount bAccount: bankAccounts ) {
			if ((bAccount.getAccountNo()).equals(accountNo))
				return bAccount;	
		}
		return null;
	}


	@Override
	public double getBalance(BankAccount account) {
		// TODO Auto-generated method stub
		BankAccount bAccount=checkAccount(account.getAccountNo());
		if (bAccount != null)
			return bAccount.getBalance();
		else
			return 0;
	}
	
	@Override
	public boolean depositMoney(BankAccount account, double amount) {
		// TODO Auto-generated method stub
		
		 if (amount > 0) {
			BankAccount bAccount=checkAccount(account.getAccountNo());
			if (bAccount != null) {
				bAccount.setBalance(bAccount.getBalance() + amount);
				return true;
			}
		 }
			return false;
		
	}


	@Override
	public boolean withdrawMoney(BankAccount account, double amount) {
		// TODO Auto-generated method stub
		 if (amount > 0) {
			BankAccount bAccount=checkAccount(account.getAccountNo());
			if (bAccount != null) {
				bAccount.setBalance(bAccount.getBalance() - amount);
				return true;
			}
		 }
			return false;
		
	}


	@Override
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) {
		// TODO Auto-generated method stub
		
		 if (amount > 0) {
			BankAccount fromBankAccount=checkAccount(fromAccount.getAccountNo());
			BankAccount toBankAccount=checkAccount(toAccount.getAccountNo());
			
			if ((fromBankAccount != null)  && (toBankAccount != null)) {
				
				fromBankAccount.setBalance(fromBankAccount.getBalance() - amount);
				toBankAccount.setBalance(toBankAccount.getBalance() + amount);
				return true;
			}
		 }
			return false;
	}

	
	

}