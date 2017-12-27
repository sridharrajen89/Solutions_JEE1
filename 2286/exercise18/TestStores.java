package com.java.training.exercise18.product;

import java.util.HashMap;

public class TestStores {
	
	public static void main(String[] args) {
	HashMap<Integer,Product> prodMap = new HashMap<Integer,Product>();
	Product	product1 = new Product();
	Product	product2 = new Product();

	product1.setProductId(101);
	product1.setProductName("Honda");
	product1.setPrice(2500);
	product1.setReorderLevel(6);
	product1.setQuantityOnHand(10);
	
	product2.setProductId(102);
	product2.setProductName("Nissan");
	product2.setPrice(3000);
	product1.setReorderLevel(9);
	product2.setQuantityOnHand(5);

	prodMap.put(101, product1);
	prodMap.put(102, product2);
	
	Stores stores = new Stores(product1,prodMap);
	
	
	
	try {
		stores.sellItem(101, 5);
		stores.updateStock(101, 25);
		System.out.println(product1.getQuantityOnHand());
		System.out.println(product1.getReorderLevel());
	} catch (ProductNotFoundException pnf) {

		System.out.println(pnf.getErrorMessage());
	}


	

	}
	
}
	
	
