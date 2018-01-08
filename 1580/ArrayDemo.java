package com.htc.myjava;
import java.util.*;
public class ArrayDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int[] values;
		values=new int[5];  //  array size is 5 starts from 0 to 4
//		int[] arr=new int[5]; // another form of declaration
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 5 nos");
		
		for (int i=0;i<values.length;i++)  // i variable scope is ended after this for loop
		{
			values[i]=s.nextInt();
	}
	
	for (int j:values)  //enhanced for loop -  java  7
	{
		System.out.println(j);
		
	}
	}
	}

