package com.java.exercise;

public class StringServiceProviderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringServiceProvider s = new StringServiceProvider();
		StringServiceProvider.reverseString("Javaprogramming");
		StringServiceProvider.linearSearch("Javaprogramming",'a');
		s.searchReplace("Javaprogramming",'i');
	}

}
