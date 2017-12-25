package com.java.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.java.exercise.DuplicateEmployeeIDException;
import com.java.exercise.Employee;

	public class Stores{
		HashMap<Integer,Product> productMap = new HashMap<Integer,Product>();
		
		//Overloaded Constructor
		public Stores(HashMap<Integer, Product> productMap) {
			super();
			this.productMap = productMap;
		}

		//Getters and Setters
		public HashMap<Integer, Product> getProductMap() {
			return productMap;
		}

		public void setProductMap(HashMap<Integer, Product> productMap) {
			this.productMap = productMap;
		}
		
		//toString()
		@Override
		public String toString() {
			return "Stores [productMap=" + productMap + "]";
		}		
		
		//public void display() {
			//System.out.println(productMap.get(1).getProductId());
			
		//}
		
		
		//Sell products
		public double sellItem(int productCode,int qtyRequired) throws ProductNotFoundException
		{
			if(productMap.get(productCode)==null) {
				throw new ProductNotFoundException();
			} 
				int qty = productMap.get(productCode).getQuantityOnHand()-qtyRequired;
				productMap.get(productCode).setQuantityOnHand(qty);
				if(qty<=10)
				{
					//int reorderqty = productMap.get(productCode).getReorderQty();
					//reorderqty=+50;
					//productMap.get(productCode).setReorderLevel(reorderqty);
					System.out.println("Purchase order is made,reorderlevel reached " );
				}
				
				return (productMap.get(productCode).getPrice() * qtyRequired);			
		}
		
		//update Stock
		public void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException
		{
			if(productMap.get(productCode)==null) {
				throw new ProductNotFoundException();
			} 
				int qty = productMap.get(productCode).getQuantityOnHand();
				qty = qty + arrivedQty;
				productMap.get(productCode).setQuantityOnHand(qty);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
			//ArrayList<Product> prList =new ArrayList<Product>();
			HashMap<Integer,Product> productMap = new HashMap<Integer,Product>();
			productMap.put(1,new Product(10,"Product1",50,20,10,50));
			productMap.put(2,new Product(13,"Product2",20,20,10,50));
			productMap.put(3,new Product(12,"Product3",10,20,10,50));
			productMap.put(4,new Product(11,"Product4",60,20,10,50));
			
			//creating object of Stores
			Stores stores = new Stores(productMap);
			
			System.out.println("Total amount for item sold  : " + productMap.get(1).getProductName() + " : " + stores.sellItem(2,10));
			System.out.println("Product qty before update : " + productMap.get(2));	
			stores.updateStock(2, 12);
			System.out.println("Product qty after update : " + productMap.get(2));
		}
			catch(ProductNotFoundException ae) {ae.printStackTrace();}
			catch(Exception e) {e.printStackTrace();}		

}
	}
