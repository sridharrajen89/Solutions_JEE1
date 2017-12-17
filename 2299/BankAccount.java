package htc.exercises.week1;

public class BankAccount {
	private String accountNo;
	private String accountName;
	private double balance;

	//Default constructor
	public BankAccount() {
		
		accountNo = "12345";
		accountName = "Prabakaran";
		balance = 100.00;
	}
	
	//Overloaded constructor
	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = 100.00;
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
