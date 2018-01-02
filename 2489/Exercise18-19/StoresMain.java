package com.htc.exe2;

import java.util.ArrayList;
import java.util.Collections;

public class StoresMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> plist = new ArrayList<Product>();
		plist.add(new Product(101,"pen", 10, 25, 10, 50));
		plist.add(new Product(102,"pencil", 15, 25, 10, 50));
		plist.add(new Product(103,"Sharpner", 5, 25, 10, 50));
		plist.add(new Product(104,"Sketches", 5, 25, 10, 50));
		plist.add(new Product(105,"Stick Notes", 3, 25, 10, 50));
		Stores store= new Stores(plist);
		Collections.sort(plist,store);
		System.out.println("products in Inventory");
		System.out.println(plist);
		try {
			System.out.println("Sell 5 pens");
			double billing = store.sellItem(101, 5);
			System.out.println("Billing price :" +billing);
			System.out.println("products in Inverntory");
			System.out.println(plist);
			System.out.println("Now update the Inventory with 100 pensils");
			store.updateStock(102, 100);
			System.out.println("products in Inventory");
			System.out.println(plist);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
