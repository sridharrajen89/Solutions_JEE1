package com.htc.exercices;

public class StringServiceProvider {
	
	public static String reverseStringStatic(String str) {
		if(str.length() == 0) {
			return str;
		}
		String reverseStr = "";
		for(int i = str.length() - 1;i >= 0;i--) {
			reverseStr = reverseStr + str.charAt(i);
		}		
		return reverseStr;
	}
	
	public String reverseStringNonStatic(String str) {
		if(str.length() == 0) {
			return str;
		}
		String reverseStr = "";
		for(int i = str.length() - 1;i >= 0;i--) {
			reverseStr = reverseStr + str.charAt(i);
		}		
		return reverseStr;
	}
	
	public static boolean searchStrStatic(String givenStr, char fndKey) {
		boolean flag = false;
		for(int i = 0; i < givenStr.length();i++) {
			if(givenStr.charAt(i) == fndKey) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean searchStrNonStatic(String givenStr, char fndKey) {
		boolean flag = false;
		for(int i = 0; i < givenStr.length();i++) {
			if(givenStr.charAt(i) == fndKey) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public static String replaceStringStatic(String givenStr, String searchStr, String replaceStr) {
		return givenStr.replaceFirst(searchStr, replaceStr);
	}
	
	public String replaceStringNonStatic(String givenStr, String searchStr, String replaceStr) {
		return givenStr.replaceFirst(searchStr, replaceStr);
	}

}
