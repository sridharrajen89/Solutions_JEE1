/**
 * 
 */
package com.htc.dec23;

import com.htc.training.BankAccount;

/**
 * @author Suresh
 *
 */
public interface IBankServiceProvider {
	public BankAccount BankAccountcheckAccount(String accountNo);
	public double getBalance( BankAccount account) throws AccountNotFoundException; 
	public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException,AccountNotFoundException;
	public boolean withdrawMoney(BankAccount account, double amount) throws InsufficientFundException,AccountNotFoundException ;
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount,double amount) throws InsufficientFundException,AccountNotFoundException ;

}
