package Exercise5;
import java.util.Arrays;

public class Bank implements IBankServiceProvider {
    private BankAccount[] bankAccounts;
    private static int lastAssignedNo;
    //private int accountNo;

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public Bank(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
        lastAssignedNo = 0;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bank bank = (Bank) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(bankAccounts, bank.bankAccounts);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(bankAccounts);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankAccounts=" + Arrays.toString(bankAccounts) +
                '}';
    }

    @Override
    public BankAccount checkAccount(int accountNo){
        for (BankAccount ba : bankAccounts){
            if(ba.getAccountNo()==accountNo){
                return ba;
            }
        }
        return null;
    }

    @Override
    public double getBalance(BankAccount account){
        return account.getBalance();
    }

    @Override
    public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException {
        if (amount>0){
            BankAccount ba = new BankAccount();
            ba = checkAccount(account.getAccountNo());
            if (ba!=null){
                ba.setBalance(ba.getBalance()+amount);
                return true;
            }
        }
        else{
            throw new InvalidAmountException("Please Enter a Valid Amount");
        }
        return false;
    }

    @Override
    public boolean withdrawMoney(BankAccount account, double amount) throws InvalidAmountException, InsufficientFundException {
        if (amount>0){
            BankAccount ba = new BankAccount();
            ba = checkAccount(account.getAccountNo());
            if (ba!=null){
                if (amount> ba.getBalance()){
                    throw new InsufficientFundException("Not enough Balance in your account");
                }
                else {
                    ba.setBalance(ba.getBalance() - amount);
                    return true;
                }
            }
        }
        else{
            throw new InvalidAmountException("Please Enter a Valid Amount");
        }
        return false;
    }
    public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) throws InvalidAmountException, InsufficientFundException {
        if (amount>0){
            BankAccount fromBA = new BankAccount();
            fromBA = checkAccount(fromAccount.getAccountNo());
            BankAccount toBA= new BankAccount();
            toBA    = checkAccount(toAccount.getAccountNo());
            if((fromBA!=null) && (toBA!=null)){
                if (amount> fromBA.getBalance()){
                    throw new InsufficientFundException("Not enough Balance in the 'FROM' account");
                }
                else {
                    toBA.setBalance(toBA.getBalance() + amount);
                    fromBA.setBalance(fromBA.getBalance() - amount);
                    return true;
                }
            }
            else {
                System.out.println("Verify the From and To Accounts numbers");
            }
        }
        else{
            throw new InvalidAmountException("Please Enter a Valid Amount");
        }
        return false;
    }
}
