package com.htc.myjava;
import java.util.*;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int no,sum=0;

		for (int i=1;i<=5;i++)
		{
			no=s.nextInt();
			if (no<0)
			{
						
				continue;
			}
			sum=sum+no;
		}
		System.out.println("Sum value is : "+sum);
	}

}
