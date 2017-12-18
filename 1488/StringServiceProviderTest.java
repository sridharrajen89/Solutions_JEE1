package com.htc.oops;

public class StringServiceProviderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringServiceProvider.reverse("String Reverse");
		System.out.println(StringServiceProvider.reverse("String Reverse"));
		StringServiceProvider.findKeyinString("Linear Search", 'i');
		System.out.println(StringServiceProvider.findKeyinString("Linear Search", 'i'));
		StringServiceProvider.replaceString("String Replace", 'e' , "i");
		System.out.println(StringServiceProvider.replaceString("String Replace", 'e', "i"));
	}

}
