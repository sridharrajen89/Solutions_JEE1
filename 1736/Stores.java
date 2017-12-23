package com.htcinc.oops.day8;

import java.util.ArrayList;
import java.io.Serializable;

public class Stores implements Serializable {

	private static final long serialVersionUID = 3121681518106792974L;
	
	private static final int CONST_REORDER_LEVEL=10;
	private static final int CONST_REORDER_QUANTITY=50;
	
	private ArrayList <Product> products;
	
	public Stores() {
		super();
		this.products = new ArrayList<Product>();
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Store [products=" + products + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((products == null) ? 0 : products.hashCode());
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
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		return true;
	}
	
	public double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException {
		//Find the product via productCode by traversing the list
		//If found subtract the qtyRequired, ensure quantity in hand is >=0 
		//check reorderlevel and order the product by the constant quantity via  the updateStock 


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
	}
	
	public void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException {
		// Find the product via product code by traversing the list
		// update the quantity for the product 
		
		for (Product prod : products) {
			if (prod.getProductId() == productCode)
				prod.setQuantityOnHand(arrivedQty);				
		}	
	}
	 
	
}
