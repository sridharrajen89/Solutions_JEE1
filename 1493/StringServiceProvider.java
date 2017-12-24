package com.htc.test;

public class StringServiceProvider {

	
	static String name1="samba";
	public static void main(String[] args) {
	System.out.println(reverseString(name1));
	}
	
	public static String reverseString(String s) {
		
		char[] try1 = s.toCharArray();
		String reverse="";
		 
        for (int i = try1.length-1; i>=0; i--)
            reverse+=try1[i];
		return reverse;
	}
	
public static String linearString(String s) {
		
		char[] try1 = s.toCharArray();
		String reverse="";
		 
        for (int i = try1.length-1; i>=0; i--)
            reverse+=try1[i];
		return reverse;
	}

}
