package com.htc.Exc2;
import java.util.*;
public class TestStores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1;
		ArrayList<Product> plist = new ArrayList<Product>();
		p1 = new Product(100,"Hamam",25,5,10,10);
		plist.add(p1);
		p1 = new Product(200,"Margo",25,5,10,10);
		plist.add(p1);
		p1 = new Product(300,"Cinthol",25,5,10,10);
		plist.add(p1);
		p1 = new Product(400,"Lux",25,5,10,10);
		plist.add(p1);
		p1 = new Product(500,"Dove",25,5,10,10);
		plist.add(p1);
		
		Stores S1 = new Stores(plist);
		System.out.println(S1);
		System.out.println(plist);
		System.out.println("After Sorting");
		Collections.sort(plist);
		System.out.println(plist);
	}

}
