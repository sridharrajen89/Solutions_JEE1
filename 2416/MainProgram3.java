package com.htc.excercise1;

public class MainProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strInput = "Java program practise";
		//Define the StringServiceProvider object
		StringServiceProvider stringServiceProvider = new StringServiceProvider();
		
		//Without static method
		System.out.println("String service provider without static method");
		System.out.println("Original string -->"+strInput);
		System.out.println("Reverse string --->"+stringServiceProvider.reverseStringWithoutStatic(strInput));
		 
		System.out.println("Find a ---->"+stringServiceProvider.linearSearchWithoutStatic(strInput, 'a'));
		System.out.println("Find z ---->"+stringServiceProvider.linearSearchWithoutStatic(strInput, 'z'));
		
		System.out.println("Replace a with i--->"+stringServiceProvider.searchAndReplaceWithoutStatic(strInput, 'a','i'));
		
		//With static method
		System.out.println("String service provider with static method");
		System.out.println("Original string -->"+strInput);
		System.out.println("Reverse string --->"+stringServiceProvider.reverseStringWithStatic(strInput));
		 
		System.out.println("Find a ---->"+stringServiceProvider.linearSearchWithStatic(strInput, 'a'));
		System.out.println("Find z ---->"+stringServiceProvider.linearSearchWithStatic(strInput, 'z'));
		
		System.out.println("Replace a with i--->"+stringServiceProvider.searchAndReplaceWithStatic(strInput, 'a','i'));

	}

}
