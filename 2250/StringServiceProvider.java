package com.java.exercise;

public class StringServiceProvider {
	
// To reverse a given string	
	public static void reverseString(String name)
	{
		for(int i = name.length()-1;i>=0;i--)
		{	
		char c = name.charAt(i);	
		System.out.print(c);
		}
	}
	
// Linear search in given string
	public static void linearSearch(String name,char c)
	{
		int count = 0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==c)
				count++;
		}
		System.out.println("");
		System.out.println("Linear search :" + count);
	}
	
//Search and replace in given string
	public void searchReplace(String name,char c)
	{
		String str = name.replace('a', 'i');
		System.out.println("Search and replace :" + str);	
	}

}
