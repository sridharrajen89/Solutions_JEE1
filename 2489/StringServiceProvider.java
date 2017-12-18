package com.htc.exe1;
public class StringServiceProvider {
	
	
	public static boolean linearSearch(String s1, String s2) { 
		boolean flag = false; 
		if (s1.indexOf(s2) > 0) 
		flag = true; 
		return flag; 
	}
	
	public static String stringReplace(String st1,String st2,String st3) {
		String replacedStr = st1.replaceAll(st2,st3);
		return replacedStr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reverse String
		String str = new StringBuffer("Pradeep").reverse().toString();
		System.out.println(str);
		//Linearsearch
		System.out.println(linearSearch("Pradeep lives in USA", "USA"));
		//Replace string 
		System.out.println("Appu is a good boy");
		System.out.println(stringReplace("Appu is a good boy", "good", "nice"));
		//		
		//
	
	}
}
