package test.com;

public class BankAccount {
	private String accountNO;
	private String accountName;
	private int balance;

//default constructor
	public BankAccount() {
		accountNO="NULL";
		accountName="NULL";
		balance=1000;
		
	}
	
//overloaded constructor 
	public BankAccount(String accountNO, String accountName) {
		super();
		this.accountNO = accountNO;
		this.accountName = accountName;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount newaccount=new BankAccount("CUST1234","SSN-Checking");
		System.out.println(newaccount.accountNO);
		System.out.println(newaccount.accountName);
		System.out.println("value of balance,not passed as argument in overloaded constructor:"+newaccount.balance);
		
		BankAccount defaultaccount=new BankAccount();
		System.out.println("displaying value of balance from default constructor:"+defaultaccount.balance);
					

	}

}
