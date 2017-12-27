package com.htc.dec24;

import java.util.ArrayList;

public class SellProduct {

	public static ArrayList<Product> p;
	
	public static void main(String[] args) {
		
		try
		{
		p = new ArrayList<Product>();
		p.add(new Product("P01", "Pepsi", 5, 100, 10,50));
		p.add(new Product("P02", "Coke", 6, 110, 10,50));
		p.add(new Product("P03", "Dew", 4, 80, 10,50));
		
		Stores s = new Stores(p);
		double val = s.sellItem("P01",90);
		System.out.println("Total amount to be paid : " +val);
		}
		
		catch(ProductNotFoundException PN)
		{
			PN.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			p.clear();
		}
	}

}
