package test.com;
import java.util.*;


public class Bankmaintest {

	public static void main(String[] args) {
		
		Bank newacct=new Bank();
		int[] acctarray= {1111,2222,0,0,0,0};
		
		newacct.setAccountNO(acctarray);
				
		System.out.println("Display acct numbers..."+newacct.getAccountNO().length);
		
		newacct.Createnewaccount();
		
		System.out.println("Display static variable..."+Bank.lastAssignedNo);
	}
	
}
