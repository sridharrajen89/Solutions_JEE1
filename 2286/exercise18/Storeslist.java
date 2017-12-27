package com.java.training.exercise18.product;

import java.util.ArrayList;

public class Storeslist {
	
	Product product = new Product();
	ArrayList<Product> prodList = new ArrayList<Product>();
	

	//Constructor
	public Storeslist(ArrayList<Product> product, ArrayList<Product> prodList) {
		super();
		this.prodList = prodList;
	}

	public void sellItem(int productCode, int qtyRequired) throws ProductNotFoundException {
		
		double totalAmount;
		
		/*product.setProductId(product.getProductId());
		product.setProductName(product.getProductName());
		product.setPrice(product.getPrice());
		product.setQuantityOnHand(product.getQuantityOnHand());*/
		
		for (Product product:this.prodList ) {
			
			if ((product.getProductId()== productCode) && (product.getQuantityOnHand()>= qtyRequired)) {
				if (product.getReorderLevel()<10) {
				totalAmount = product.getPrice()* qtyRequired;
				System.out.println("Total Amount:  " + totalAmount);
				
				}
				else
				{
					System.out.println("purchase order is made"); 
				}
						
			}
			else {
			
				throw new ProductNotFoundException("");
				
			}
			
		}
	}
	
	public void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException {
		
		for (Product product:this.prodList ) {
			
			if (product.getProductId()== productCode) {
				
				product.setQuantityOnHand(arrivedQty);
				this.prodList.add(product);
				
			}
			else {
				
				throw new ProductNotFoundException("");
	
			}
		}
	}
}
