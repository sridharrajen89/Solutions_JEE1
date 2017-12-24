package Exercise5;

public class BankMain {
    public static void main(String[] args) {

        int lastAssignedNo = 0;
        try {
            BankAccount bankArray[]=new BankAccount[3];
            bankArray[0] = new BankAccount("Shankar", 150000);
            bankArray[0].setAccountNo(1000);
            lastAssignedNo++;
            bankArray[1] = new BankAccount("Ashok", 250000);
            bankArray[1].setAccountNo(bankArray[0].getAccountNo()+lastAssignedNo);
            lastAssignedNo++;
            bankArray[2] = new BankAccount("Pradeep", 350000);
            bankArray[2].setAccountNo(bankArray[0].getAccountNo()+lastAssignedNo);
            Bank ba = new Bank(bankArray);
            BankAccount checkAcc = ba.checkAccount(1000);
            System.out.println(checkAcc);
            double balance = ba.getBalance(bankArray[1]);
            System.out.println(balance);
            System.out.println(bankArray[0]);

            boolean depMoney = ba.depositMoney(bankArray[0], 5005);
            if(depMoney)
            {
                System.out.println("After Deposit");
                System.out.println(bankArray[0]);
            }
            boolean withdraw = ba.withdrawMoney(bankArray[1], 5005);
            if(withdraw)
            {
                System.out.println("After Withdrawal");
                System.out.println(bankArray[1]);
            }
            System.out.println(bankArray[1]);
            System.out.println(bankArray[2]);
            boolean transfer = ba.transferMoney (bankArray[1], bankArray[2], 3001);
            if(transfer)
            {
                System.out.println("After Transfer");
                System.out.println(bankArray[1]);
            }
            System.out.println(bankArray[2]);
        }
        catch(InsufficientFundException ife)
        {
            ife.getErrorMessage();
        }
        catch(InvalidAmountException iae)
        {
            iae.getErrorMessage();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally {
        }
    }
}
