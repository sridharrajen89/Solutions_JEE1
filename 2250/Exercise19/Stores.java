package com.java.exercise2;

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

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ArrayList<Product> prList =new ArrayList<Product>();
			prList.add(new Product(20,"Product1",500,10,10,10));
			prList.add(new Product(33,"Product2",200,10,10,10));
			prList.add(new Product(15,"Product3",100,10,10,10));
			prList.add(new Product(50,"Product4",600,10,10,10));
			
			//creating object of Stores
			Stores stores = new Stores(prList);
			
			//creating object to store sorted arrayList
			Collections.sort(prList,new ComparatorImpl());
			
			System.out.println("Sorted product by price  : ");
			for(Product p : prList)
			{
				System.out.println(p);
			}
			
		}
}
