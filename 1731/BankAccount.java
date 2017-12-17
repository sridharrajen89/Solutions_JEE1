package htc.test;

public class BankAccount extends Object {

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	private int accountId;
	private String accountName;
	private int balance =10000;

	// overloaded construtor 
	public BankAccount(int accountId, String accountName) {
		super();
		System.out.println("overloaded Constructor is fired ");
		this.accountId = accountId;
		this.accountName = accountName;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
	
		return "EntityClass [AccountId =" +accountId +", Account Name  ="+accountName+", Balance--" +balance+"]";
	}

}


