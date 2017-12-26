package com.htc.exe1;
import java.util.*;

public class Stores implements Comparator<Product>{
	
	public static void main(String args[]) {
				
		ArrayList<Product> plist = new ArrayList<Product>();
		plist.add(new Product("Honda"));
		plist.add(new Product("Ford"));
		plist.add(new Product("BMW"));
		plist.add(new Product("Audi"));
		plist.add(new Product("Nissan"));
		Stores st = new Stores();
				
		Collections.sort(plist,st);
		System.out.println(plist);
	}
	public int compare(Product p1, Product p2) {
		
		return p1.getProductName().compareTo(p2.getProductName());
	}

}
