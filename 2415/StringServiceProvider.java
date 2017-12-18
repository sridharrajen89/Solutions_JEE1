package com.htc.oops;

import java.io.Serializable;

public class StringServiceProvider implements Serializable {
	
	private String str = "";

	public StringServiceProvider() {
		// TODO Auto-generated constructor stub
	}
	
	public void reverseStringNoStatic (String str){
		int j = 0;
		char[] reverseStr =  new char[str.length()];
		for(int i=str.length()-1;i>=0;i--)
		{
			
			reverseStr[j] = str.charAt(i);
			j++;
		//System.out.println(str.charAt(i));	
		}
		System.out.println(reverseStr);
	}
	
	public static void reverseStringStatic (String str){
		int j = 0;
		char[] reverseStr =  new char[str.length()];
		for(int i=str.length()-1;i>=0;i--)
		{
			
			reverseStr[j] = str.charAt(i);
			j++;
		//System.out.println(str.charAt(i));	
		}
		System.out.println(reverseStr);
	}
	
	public void linearSearchNoStatic (String str, char find){		
		for(int i=0;i<str.length();i++)
		{
			if (str.charAt(i)==find){
				System.out.println(find+" is found at location "+(i+1));
				break;
			}
		}
	}
	
	public static void linearSearchStatic (String str, char find){		
		for(int i=0;i<str.length();i++)
		{
			if (str.charAt(i)==find){
				System.out.println(find+" is found at location "+(i+1));
				break;
			}
		}
	}
	public void replaceSearchNoStatic (String str, char find, char replace){	
		char[] strReplaced =  new char[str.length()];
		//String replacedString = "";
		for(int i=0;i<str.length();i++)
		{

			if (str.charAt(i)==find){
				strReplaced[i] = replace;
				System.out.println("strReplaced:"+strReplaced[i]);
			}
			else {
				strReplaced[i] = str.charAt(i);
			}
		}
		
		//System.out.println(strReplaced);		
		System.out.println("Replaced String:" +  strReplaced.toString());
		System.out.println("Replaced String:" +  java.util.Arrays.toString(strReplaced));
		
		//strReplaced.toString()); toString
		
	}
	public static void replaceSearchStatic (String str, char find, char replace){	
		char[] strReplaced =  new char[str.length()];
		//String replacedString = "";
		for(int i=0;i<str.length();i++)
		{

			if (str.charAt(i)==find){
				strReplaced[i] = replace;
				System.out.println("strReplaced:"+strReplaced[i]);
			}
			else {
				strReplaced[i] = str.charAt(i);
			}
		}
		
		//System.out.println(strReplaced);		
		System.out.println("Replaced String:" +  strReplaced.toString());
		System.out.println("Replaced String:" +  java.util.Arrays.toString(strReplaced));
		
		//strReplaced.toString()); toString
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((str == null) ? 0 : str.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringServiceProvider other = (StringServiceProvider) obj;
		if (str == null) {
			if (other.str != null)
				return false;
		} else if (!str.equals(other.str))
			return false;
		return true;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public static void main(String[] args) {
		StringServiceProvider scp = new StringServiceProvider();
		scp.reverseStringNoStatic("Shankar");
		StringServiceProvider.reverseStringStatic("Shankar");	
		scp.linearSearchNoStatic("Shankar", 'k');
		scp.replaceSearchNoStatic("Shankar", 'k','n');
		StringServiceProvider.linearSearchStatic("Shankar", 'k');
		StringServiceProvider.replaceSearchStatic("Shankar", 'k','n');
		
	}
}