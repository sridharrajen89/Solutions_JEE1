package com.java.training.exercise18.product;

import java.util.HashMap;

public class Stores {

	Product product = new Product();
	HashMap<Integer,Product> prodMap = new HashMap<Integer,Product>();


	//Constructor

	public Stores(Product product,HashMap<Integer, Product> prodMap) {
		super();
		this.product = product;
		this.prodMap = prodMap;
	}


	public void sellItem(int productCode, int qtyRequired) throws ProductNotFoundException {

		double totalAmount;

		if ( (prodMap.get(product.getProductId())!=null) ) {// && (prodMap.get(product.getQuantityOnHand()>=qtyRequired)) )  { 
			
			if (product.getReorderLevel()<10 && product.getQuantityOnHand()>qtyRequired ) {
				
				product.setReorderLevel(product.getReorderLevel()+1);
				product.setQuantityOnHand(product.getQuantityOnHand()-qtyRequired);
				totalAmount = product.getPrice()* qtyRequired;
				System.out.println("Total Amount:  " + totalAmount);

			}
			else
			{
				throw new ProductNotFoundException("Requested Product Quantity Not Found");
				
				//System.out.println("purchase order is made"); 
			}

		}
		else {

			throw new ProductNotFoundException("Requested Product Not Found");

		}
	}

	
	public void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException {

		if ( (prodMap.get(product.getProductId())!=null) ) {
			int currentQuantity=product.getQuantityOnHand();
			currentQuantity= currentQuantity+arrivedQty;
			product.setQuantityOnHand(currentQuantity);
			this.prodMap.put(productCode, product);

		}
		else {

			throw new ProductNotFoundException("Requested Product Not Found");

		}
	}
}
