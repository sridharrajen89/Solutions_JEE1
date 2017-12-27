package com.java.training;

public class StringServiceProvider {
	
	private String inputString;
	
	public String reverseString() {
		
		String inputString = "String Operations Service";
		System.out.println("Before Reversal   " + inputString);
		String reverseString = new StringBuffer(inputString).reverse().toString();
		return reverseString;
		
		}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((inputString == null) ? 0 : inputString.hashCode());
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
		if (inputString == null) {
			if (other.inputString != null)
				return false;
		} else if (!inputString.equals(other.inputString))
			return false;
		return true;
	}

	public String linearSearch(String[] inputString,String srchString) {
		
		int flag = 0;
		int i=0;
		for(i=0;i<inputString.length;i++)
		{
			
			if(srchString.equals(inputString[i])) {
				flag =1;
				break;
			}
			
			
		}
		if (flag==1)
		{
			return "Search char found at position: " + i+1;
		}
		else
		{
			return "Search char didn't find in the given string";
		}
		
		
	}
	
	
	
	public String searchAndReplace() {
		
		String inputString = "String Operations Service";
		System.out.println("Before Replace   " + inputString);
		String replaceString = inputString.replaceAll("Service", "Provider");
		return replaceString;	
		
		}
	
	
	public static void main(String[] args) {

		StringServiceProvider stringServiceProvider = new StringServiceProvider();
		System.out.println("After Reversal    " + stringServiceProvider.reverseString());
		System.out.println("After Replace    " + stringServiceProvider.searchAndReplace());
		String[] inputString = new String[4];
		inputString[0] = "This";
		inputString[1] = "code";
		inputString[2] = "is";
		inputString[3] = "Sample";
		
		System.out.println(stringServiceProvider.linearSearch(inputString, "code"));
		
		
		
		
		
	}


}
