package com.java.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stores{
	ArrayList<Product> product = new ArrayList<Product>();
	
	//Overloaded Constructor
	public Stores(ArrayList<Product> product) {
		super();
		this.product= product;
	}

	//Getters and Setters
	public ArrayList<Product> getProduct() {
		return product;
	}

	public void setProduct(ArrayList<Product> product) {
		this.product = product;
	}
	
	//Sorting Product ArrayList objects
	public ArrayList<Product> sortProductbyId()
	{
		Collections.sort(product);
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Product> pr =new ArrayList<Product>();
		pr.add(new Product(20,"Product1",100,10,10,10));
		pr.add(new Product(33,"Product2",200,10,10,10));
		pr.add(new Product(15,"Product3",300,10,10,10));
		pr.add(new Product(50,"Product4",400,10,10,10));
		
		//creating object of Stores
		Stores stores = new Stores(pr);
		
		//creating object to store sorted arrayList
		ArrayList<Product> sortarray = stores.sortProductbyId();
		
		System.out.println("Sorted product by product id  : ");
		for(Product p : sortarray)
		{
			System.out.println(p);
		}
		
	


	}



}
