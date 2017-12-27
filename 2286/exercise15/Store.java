package com.java.training.exercise15.stores;

import java.util.ArrayList;
import java.util.Collections;


public class Store {
	
	private ArrayList<Products> prodList = new ArrayList<Products>();

	public Store(ArrayList<Products> prodList) {
		super();
		
		this.prodList = prodList;
	}

	public void sortprodList() {
		
		prodList.sort(null);
		
	}
	
	public static void main(String[] args) {
		ArrayList<Products> productList = new ArrayList<Products>();
		
		productList.add(new Products(101,"Product1",1000,10,1,5));
		productList.add(new Products(105,"Product2",1500,15,1,6));
		productList.add(new Products(102,"Product3",800,7,1,3));
		Collections.sort(productList);
		
		for (Products list:productList) {
		System.out.println(list);
		
		}
	
	}
	

}
