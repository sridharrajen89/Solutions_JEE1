package com.htc.dec23;

import com.htc.training.BankAccount;

public class BankTest {
	static int lastAssignedNo = 0;
	
	
	public static void main(String[] args) 
	{
		
		try
		{
		BankAccount[] ba1 = new BankAccount[3];
		ba1[0] = new BankAccount("Suresh.U",10000);
		ba1[0].setAccountNo("AXIS10"+Integer.toString(lastAssignedNo));
		lastAssignedNo++;
		ba1[1] = new BankAccount("Suresh.J",20000);
		ba1[1].setAccountNo("AXIS10"+Integer.toString(lastAssignedNo));
		lastAssignedNo++;
		ba1[2] = new BankAccount("Suresh.M",30000);
		ba1[2].setAccountNo("AXIS10"+Integer.toString(lastAssignedNo));
		lastAssignedNo++;
		
		Bank ba = new Bank(ba1);
		BankAccount op = ba.BankAccountcheckAccount("AXIS100");
		System.out.println(op);
		
		double accbal= ba.getBalance(ba1[1]);
		System.out.println(accbal);
		
		boolean b1 = ba.depositMoney(ba1[0], 1000);
		   if(b1)
		     {
			    System.out.println(ba1[0]);
		     }
		boolean b2 = ba.withdrawMoney(ba1[0], 5000);
			if(b2)
			{
				System.out.println(ba1[0]);
			}
		boolean b3 =  ba.transferMoney(ba1[0], ba1[1], 5000);
			if(b3)
			{
				System.out.println("member1: "+ba1[0]+" member2: " +ba1[1]);
			}
		
	    }
		catch(AccountNotFoundException AN)
		{
			AN.printStackTrace();
		}
		catch(InsufficientFundException IF)
		{
			IF.printStackTrace();
		}
		catch(InvalidAmountException IA)
		{
			IA.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Reached finally block");
		}
	}
}
