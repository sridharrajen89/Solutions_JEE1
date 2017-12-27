package com.htc.dec24;


import java.util.*;

public class StoresMain {

	public static void main(String[] args) {
		
		ArrayList<Product> p = new ArrayList<Product>();
		p.add(new Product("P01", "Pepsi", 5, 100, 10,50));
		p.add(new Product("P02", "Coke", 6, 110, 20,60));
		p.add(new Product("P03", "Dew", 4, 80, 10,40));
		
		Stores s = new Stores(p);
		System.out.println(s);
		System.out.println(p);
		
		s.sortByProductName();
		//System.out.println(s.toString());
		
	}

}


