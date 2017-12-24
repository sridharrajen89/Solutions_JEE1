package com.htc.training;

public class StringServiceProvider {

	public static String stringReverse(String s)
	{
		String revString = new StringBuffer(s).reverse().toString();
		return revString;
	}
	
	public static boolean stringLinearSearch(String s,char c)
	{
		boolean flag = false;
		char[] s1 = s.toCharArray();
				
		for(int i = 0;i<s1.length;i++)
		{
			if(c==s1[i])
			{
				flag = true;
				break;
			}
		}
	  return flag;		
	}
	
	public static String stringSearchReplace(String s,char c1,char c2)
	{
		
		char[] s1 = s.toCharArray();
		for(int i = 0;i<s1.length;i++)
		{
			if(c1==s1[i])
			{
				String repString = s.replace(s1[i], c2);
				return repString;	
			}
			
		}
		return null;
	  	
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String s = "Suresh";
		
		System.out.println("<<<<<<<<<<Reverse string Results>>>>>>>");
		
		System.out.println("Before String reverse:" +s);
		String s1 = StringServiceProvider.stringReverse(s);
		System.out.println("Afetr String reverse:" +s1);
		
		System.out.println("<<<<<<<<<<Linear search Results>>>>>>>");
		
		boolean x = stringLinearSearch(s,'J');
		if(x)
		{
			System.out.println("The input key value is found in " +s);
		}
		else
		{
			System.out.println("The input key value is not found in " +s);
		}
		
		System.out.println("<<<<<<<<<<Linear search Results>>>>>>>");
		
		System.out.println("Before calling stringSearchReplace: " +s);
		String s2 = StringServiceProvider.stringSearchReplace(s,'r','u');
		System.out.println("After calling stringSearchReplace: " +s2);		
	}

}
