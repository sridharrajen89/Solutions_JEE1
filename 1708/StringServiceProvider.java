package com.htc.CoreJavaExercise;
import java.util.*;
import java.lang.*;
import java.io.*;
class StringServiceProvider {
//private String reversetext;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter String");
		String mytext = keyboard.nextLine();
		String input = mytext;
	/*Converst String using toCHARArray 	
		char[] try1 = input.toCharArray();
		for (int i = try1.length -1 ; i>=0;i--) */
		String reverse = new StringBuffer(mytext).reverse().toString()	;
		String rev = reverse.toString();
	//		System.out.println(try1[i]);
		System.out.println(rev);
	}
/*class linearSearch{
	public void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter String");
		String mytext1 = keyboard.nextLine();
		String search1 = keyboard.nextLine();
		String input = mytext1;
		int i;
		boolean flag = false;
		char[] mytext11 =input.equals(mytext1);
		
		for(i=0; i < mytext11.length(); i++)
		{
			if (mytext11[i] == search1)
					{
				flag = true;
					}
		}
		if (flag) {
			System.out.println(search1 + " is found in the text.");
		}
		else {
			System.out.println(search1 + "not found in the text");
				
					}
		}
			
		}*/
}

