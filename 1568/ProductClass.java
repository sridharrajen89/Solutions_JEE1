package com.htcinc.weektwo;

import java.util.HashMap;

public class ProductClass {

	public static void main(String[] args) {
		
		HashMap<Integer, Product> productMap = new HashMap<Integer, Product>();
		
		productMap.put(1, new Product(500,"Himalaya",56,120,false,0));
		productMap.put(2, new Product(505,"cipla",49,65,false,0));
		productMap.put(3, new Product(503,"zandu",89,96,false,0));
		productMap.put(4, new Product(510,"amway",69,83,false,0));
		productMap.put(5, new Product(520,"reddylabs",189,84,false,0));
		
		Stores stores = new Stores(productMap);
//		System.out.println(stores.toString());
		Stores.printMap(productMap);
		
		//sell item 
		try {
			System.out.println("product 2 and requied items 2");
			double amount = 0;
			amount = stores.sellItem(2, 2);
			System.out.println("Total amount : "+amount);
		} catch(ProductNotFoundException pn) {
			pn.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		Stores.printMap(productMap);
//		System.out.println(stores.toString());
		
		//update the stock
		try {
			System.out.println("update product 3 and existing items 4");
			stores.updateStock(3,4);
		} catch(ProductNotFoundException pn) {
			pn.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		Stores.printMap(productMap);
//		System.out.println(stores.toString());
	}

}
