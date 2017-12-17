package com.htc.excercise1;

import java.io.Serializable;

public class StringServiceProvider implements Serializable {

	//Method to reverse the given string without static
	public String reverseStringWithoutStatic(String strInput) {
		int j = 0;
		int strLength = strInput.length();
		char[] strReverse = new char[strLength];
		for(int i=strLength-1; i>=0; i--) 
		{
			strReverse[j] = strInput.charAt(i);
			j++; 
		}
		return String.valueOf(strReverse);
	}
	
	//Method to find the linear search without static
	public int linearSearchWithoutStatic(String strInput, char charToFind) {
		int intPosition = 0;
		for(int i =0; i<strInput.length(); i++) 
		{
			if(charToFind == strInput.charAt(i))
			{
				intPosition = i+1;
				break;
			}
		}
		return intPosition;
	}
	
	//In Given string search for charToSearch and replace with charToReplace without static 
	public String searchAndReplaceWithoutStatic(String strInput, char charToSearch, char charToReplace) {
		int intPosition = 0;
		int strLength = strInput.length();
		char[] strOutput = new char[strLength];
		for(int i=0; i<strLength;i++)
		{
			if(charToSearch == strInput.charAt(i))
				strOutput[i] = charToReplace;
			else
				strOutput[i] = strInput.charAt(i);
		}
		return String.valueOf(strOutput);
		
	}
	
	//Method to reverse the given string with static
	public static String reverseStringWithStatic(String strInput) {
		int j = 0;
		int strLength = strInput.length();
		char[] strReverse = new char[strLength];
		for(int i=strLength-1; i>=0; i--) 
		{
			strReverse[j] = strInput.charAt(i);
			j++; 
		}
		return String.valueOf(strReverse);
	}
	
	//Method to find the linear search with static
	public static int linearSearchWithStatic(String strInput, char charToFind) {
		int intPosition = 0;
		for(int i =0; i<strInput.length(); i++) 
		{
			if(charToFind == strInput.charAt(i))
			{
				intPosition = i+1;
				break;
			}
		}
		return intPosition;
	}
	
	//In Given string search for charToSearch and replace with charToReplace with static 
	public static String searchAndReplaceWithStatic(String strInput, char charToSearch, char charToReplace) {
		int intPosition = 0;
		int strLength = strInput.length();
		char[] strOutput = new char[strLength];
		for(int i=0; i<strLength;i++)
		{
			if(charToSearch == strInput.charAt(i))
				strOutput[i] = charToReplace;
			else
				strOutput[i] = strInput.charAt(i);
		}
		return String.valueOf(strOutput);
		
	}
}
