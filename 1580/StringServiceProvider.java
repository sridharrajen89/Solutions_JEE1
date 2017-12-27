package com.htc.week1;

import java.util.*;

import java.lang.*;

import java.io.*;
//Service provider
class StringServiceProvider {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter String");

		String mytext = keyboard.nextLine();

		String input = mytext;

		String reverse = new StringBuffer(mytext).reverse().toString()	;

		String rev = reverse.toString();

		System.out.println(rev);

	}

}
