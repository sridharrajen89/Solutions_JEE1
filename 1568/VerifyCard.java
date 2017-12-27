/**
 * 
 */
package com.htcinc.weektwo;

import java.util.regex.Pattern;

/**
 * @author Sree
 *
 */
public class VerifyCard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Logic for Email Validations with AlphaNumberic/@/M/m/N/n
    	System.out.println("verify regular expression for eamil validation which will end with Alpha numberic/@/M/m/N/n ");
    	System.out.println(Pattern.matches("([A-Za-z0-9+_.-]){10,15}+@([A-Za-z0-9.]+[MmNn])","123456789012345@gmail.com"));
    	System.out.println(Pattern.matches("([A-Za-z0-9+_.-]){10,15}+@([A-Za-z0-9.]+[MmNn])","123*456789-ab@gmail.com"));
    	System.out.println(Pattern.matches("([A-Za-z0-9+_.-]){10,15}+@([A-Za-z0-9.]+[MmNn])","1234@56789_ab@yahoo.in"));
    
    	//Logic for Password Verification
    	System.out.println("verify regular expression for password validation");
    	System.out.println(Pattern.matches("[a-z|A-Z|0-9@!*$&]{8,}","Harerama@9"));
    	System.out.println(Pattern.matches("[a-z|A-Z|0-9@!*$&]{8,}","**"));
    
    	//Logic for Credit card validation
    	System.out.println("verify regular expression for Credit Card validation");
    	System.out.println(Pattern.matches("[0-9]{4,4}-[0-9]{4,4}-[0-9]{4,4}-[0-9]{4,4}", "1111-2222-3333-4444"));
    	System.out.println(Pattern.matches("[0-9]{4,4}-[0-9]{4,4}-[0-9]{4,4}-[0-9]{4,4}", "aa12-1234-1234-1234"));
    	System.out.println(Pattern.matches("[0-9]{4,4}-[0-9]{4,4}-[0-9]{4,4}-[0-9]{4,4}", "1234 1234-1234-1234"));
    
    	}
    
    }