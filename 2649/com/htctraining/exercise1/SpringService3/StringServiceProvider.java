package com.htctraining.exercise1.SpringService3;

public class StringServiceProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Using static methods");
		System.out.println(StringServiceProvider.staticStringReverse("Hello"));
		System.out.println(StringServiceProvider.staticLinearSearch("Hello",'m'));
		System.out.println(staticSearchReplace("Hello",'l','m'));
		StringServiceProvider ssp = new StringServiceProvider();
		System.out.println("\nUsing Object");
		System.out.println(ssp.stringReverse("Hello"));
		System.out.println(ssp.LinearSearch("Hello", 'l'));
		System.out.println(ssp.searchReplace("Hello", 'l', 'm'));
	}

	public static String staticStringReverse(String input) {
		 char[] try1 = input.toCharArray();
		 String temp="";		 
	        for (int i = try1.length-1; i>=0; i--)
	            temp = temp + try1[i];	        
        return temp;
	}
	public String stringReverse(String input) {
		 char[] try1 = input.toCharArray();
		 String temp="";		 
	        for (int i = try1.length-1; i>=0; i--)
	            temp = temp + try1[i];	        
       return temp;
	}
	public static String staticLinearSearch(String input,char character) {
		 char[] try1 = input.toCharArray();		 
		 for (int i =0;i< try1.length; i++)
	            if( try1[i] == character)
	            	return "Character <"+character +"> found at position " + i ;
       return "Character <"+character +">  Not found";
	}
	public String LinearSearch(String input,char character) {
		 char[] try1 = input.toCharArray();		 
	     for (int i =0;i< try1.length; i++)
	            if( try1[i] == character)
	            	return "Character <"+character +"> found at position " + i ;
      return "Character <"+character +">  Not found";
	}
	public static String staticSearchReplace(String input,char character, char newcharacter) {
		 char[] try1 = input.toCharArray();		 
		 String temp="";		 
		 for (int i =0;i< try1.length; i++)
	        	if(try1[i]==character)
	        		temp=temp+newcharacter;
	        	else
	        		temp = temp + try1[i];	      
	 return temp;
	}
	public  String searchReplace(String input,char character, char newcharacter) {
		 char[] try1 = input.toCharArray();		 
		 String temp="";		 
		 for (int i =0;i< try1.length; i++)
	        	if(try1[i]==character)
	        		temp=temp+newcharacter;
	        	else
	        		temp = temp + try1[i];	      
	 return temp;
	}
}
