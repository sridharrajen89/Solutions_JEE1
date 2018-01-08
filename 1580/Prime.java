package com.htc.oops;
import java.util.*;
// example for print the prime number

public class Prime {
	//method definition
	static int checkPrime(int start, int end)
	{
	int count=0;
	for(int i=start;i<=end;i++)
	{
		int flag=0;
		for(int j=2;j<=i;j++)
		{
			System.out.println(i+"<------>"+j);
			if(i%j==0)
			{
				flag=1;
				break;
				
			}
		}
		if(flag==0) 
		{
			System.out.println("The Prime number is "+i);
			count++;
			
			}
		return count;
		
		}
	}
	//public static void main(String args[])  
	 public static void main(String args[]) 
	{
		//input phase
		System.out.println("Enter the first and last numbers :");
		Scanner sc=new Scanner(System.in);
		int start1=sc.nextInt();
		int end1=sc.nextInt();
		int num=checkPrime(start1,end1);
		System.out.println("Number of prime numbers available between"+start1+"and"+end1+"");
		sc.close();
				
	}
	}
		


