/**
 * 
 */
package com.test;

/**
 * @author Ramkey_IBM_PC
 * Prepare a StringServiceProvider class which has the following methods  
 *  (a) To reverse a given string  
 *  (b) To do linear search in a given string 
 *  (c) To do search and replace operation in a given string  
 *  Note: code the requirement with 2 possibilities (with and without static methods) 
 */
public class StringServiceProvider {
	
	static String reverseString (String s1) {
		String s2="";
		for (int i=s1.length();i>0;i--) {
			s2 = s2 + s1.charAt(i-1);
		}
		return s2;
	}
	
	static boolean searchString (String s1, String s2) {
		boolean flag = false;
		if (s1.indexOf(s2) > 0)
			flag = true;
		return flag;
	}
	
	String replaceString (String s1, String s2, String s3) {
		String returnString=null;
		int i = s1.indexOf(s2);
		if (i != -1) {
			returnString = s1.substring(0, i);
			returnString = returnString + s3;
			returnString = returnString + s1.substring(i + s2.length());
		}
		return returnString;
	}
	
	public static void main (String args[]) {
		StringServiceProvider ssp = new StringServiceProvider ();
		String str1 = "Malayalam";
		System.out.println("Given String " + str1);
		System.out.println("Reversed String " + StringServiceProvider.reverseString(str1));
		System.out.println(searchString ("Failure is the stepping stone for success", "the"));
		System.out.println(searchString ("Failure is the stepping stone for success", "then"));
		System.out.println(ssp.replaceString ("Laughter is the best medicine","Laughter","Humor"));
		System.out.println(ssp.replaceString ("Laughter is the best medicine","Sad","Humor"));
		System.out.println(ssp.replaceString ("Laughter is the best medicine","the best","a better"));
	}
}
