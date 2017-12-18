package com.java.training;

public class StringServiceProvider {
	
/*	private String inputString;
*/	
	/*public String getInputString() {
		return inputString;
	}

	public void setInputString(String inputString) {
		this.inputString = inputString;
	}*/

	
	public String reverseString() {
		
		String inputString = "String Operations Service";
		System.out.println("Before Reversal   " + inputString);
		String reverseString = new StringBuffer(inputString).reverse().toString();
		return reverseString;
		
		}
	
	public String linearSearch() {
		return null;
			
		
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

		
		
		
		
		
		
	}


}
