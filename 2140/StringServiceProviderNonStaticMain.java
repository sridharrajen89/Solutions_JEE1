package com.htc.corejava.trainingexcerise.week1;

public class StringServiceProviderNonStaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "KirankumarGudipudi@gmail.com";
		String fromString = "Kiran";
		String toString = "Chinna";
		char searchChar = 'G';
		StringServiceProviderNonStatic ssp = new StringServiceProviderNonStatic ("KirankumarGudipudi@gmail.com");
		System.out.println("Reverse string for "+inputString+ " is: "+ssp.reverseString(inputString));
		if (ssp.searchCharInString(inputString,searchChar) != 0)
			System.out.println("Char "+searchChar+" is found at position "+ssp.searchCharInString(inputString,searchChar)+" in input string: "+inputString);
		else
			System.out.println("Char "+searchChar+" is not found in input string: "+inputString);
		System.out.println("The new string after replacing "+fromString+" to "+toString+" in "+inputString+" is: "+ssp.searchAndReplaceInString(inputString, fromString, toString));
	}
}