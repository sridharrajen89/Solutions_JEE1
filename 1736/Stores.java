package com.htcinc.oops.day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.Serializable;

public class Stores implements Serializable {

	private static final long serialVersionUID = 3121681518106792974L;
	
	//private ArrayList <Product> products;
	private HashMap<Integer, Product> productMap;
	
	public Stores() {
		super();
		//this.products = new ArrayList<Product>();
		this.productMap = new HashMap<Integer, Product>();
	}

	public HashMap<Integer,Product> getProducts() {
		return productMap;
	}

	public void setProducts(HashMap<Integer,Product> products) {
		this.productMap = products;
	}



	@Override
	public String toString() {
		return "Stores [productMap=" + productMap + "]";
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productMap == null) ? 0 : productMap.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stores other = (Stores) obj;
		if (productMap == null) {
			if (other.productMap != null)
				return false;
		} else if (!productMap.equals(other.productMap))
			return false;
		return true;
	}

	public double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException, QuantityCannotBeFulfilledException {
		//Find the product via productCode by traversing the list
		//If found subtract the qtyRequired, ensure quantity in hand is >=0 
		//check reorderlevel and order the product by the constant quantity via  the updateStock 

		/*
		for (Product prod : products) {
			if (prod.getProductId() == productCode) {
				
				int qtyRemaining=prod.getQuantityOnHand() - qtyRequired;
				
				if (qtyRemaining > 0 ) 
					prod.setQuantityOnHand(qtyRemaining);
				
				if (qtyRemaining <= CONST_REORDER_LEVEL ) 
					updateStock(productCode, CONST_REORDER_QUANTITY);
			break;
			}
		}
		return qtyRequired;
		*/
		
		if (productMap.containsKey(productCode)) {
			if (qtyRequired < 0)
				throw new QuantityCannotBeFulfilledException("Invalid quantity. Request cannot be fulfilled");
			Product prod=productMap.get(productCode);
			int quantityOnHand=prod.getQuantityOnHand();
			int quantityRemaining=quantityOnHand - qtyRequired;
			if (quantityRemaining < 0 ) {
				throw new QuantityCannotBeFulfilledException("Not sufficient quantity on hand. Quantity cannot be fulfilled.");
			} 
			
			if (quantityRemaining <= prod.getReorderQty()) {
				System.out.println("Purchase order is made");
				//updateStock(productCode, prod.getReorderQty());   
			}
			prod.setQuantityOnHand(quantityRemaining);

			productMap.replace(productCode, prod);
			return qtyRequired * prod.getPrice();
			
		}
		else 
			throw new ProductNotFoundException();
		
		
	}
	
	public void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException {
		// Find the product via product code by traversing the list
		// update the quantity for the product 
		/*
		for (Product prod : products) {
			if (prod.getProductId() == productCode)
				prod.setQuantityOnHand(arrivedQty);				
		}	
		*/
		
		if (productMap.containsKey(productCode)) {
			Product prod=productMap.get(productCode);
			prod.setQuantityOnHand(prod.getQuantityOnHand() + arrivedQty);
			productMap.replace(productCode, prod);			
		} else 
			throw new ProductNotFoundException();
	}
	 
	
}
