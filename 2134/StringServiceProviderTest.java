package com.htc.exercicesTest;

import com.htc.exercices.StringServiceProvider;

public class StringServiceProviderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "NOTHING IS HARD TO LEARN";
		System.out.println("String Operation using Static Methods");
		System.out.println(StringServiceProvider.reverseStringStatic(str));
		System.out.println(StringServiceProvider.searchStrStatic(str,'I'));
		System.out.println(StringServiceProvider.replaceStringStatic(str,"HARD","LESSER"));
		System.out.println("");
		
		System.out.println("String Operation using Non Static Methods");
		StringServiceProvider ssp = new StringServiceProvider();
		System.out.println(ssp.reverseStringNonStatic(str));
		System.out.println(ssp.searchStrNonStatic(str,'I'));
		System.out.println(ssp.replaceStringNonStatic(str,"HARD","LESSER"));
	}

}
