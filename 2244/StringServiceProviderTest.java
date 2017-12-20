package com.htc.javaweek1;

public class StringServiceProviderTest {

	public static void main(String[] args) {
		StringServiceProvider ssp1 = new StringServiceProvider();
		StringServiceProvider ssp2 = new StringServiceProvider();		
		System.out.println("Calling reverseString Static method#1 from StringServiceProvider Class..");
		StringServiceProvider.reverseString("ramkumar");
		System.out.println();
		System.out.println("Calling linearSearch method#2 from StringServiceProvider Class..");
		ssp1.linearSearch();
		System.out.println("Calling SearchStringReplaceEmp method#3 from StringServiceProvider Class..");
		ssp2.SearchStringReplaceEmp("Search and Replace String Demo","Demo","Demonstration");

	}

}
