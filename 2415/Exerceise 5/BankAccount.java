package Exercise5;

import java.io.Serializable;

public class BankAccount implements Serializable {

    private int accountNo;
    private String accountName;
    private double balance;


    public BankAccount() {
        // TODO Auto-generated constructor stub
        accountNo = 1000;
        accountName = "";
        balance = 1000;
    }

    public BankAccount(String accountName, double balance) {
        //this.accountNo = "ICICI0001";
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
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

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNo='" + accountNo + '\'' +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}