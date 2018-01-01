package com.htc.Exc2;
import java.util.*;
public class Stores {

	private ArrayList<Product> plist;
	
	public Stores() {
		super();
		this.plist = null;
	}
	
	public Stores(ArrayList<Product> plist) {
		super();
		this.plist = plist;
	}
	
	public ArrayList<Product> getPlist() {
		return plist;
	}

	public void setPlist(ArrayList<Product> plist) {
		this.plist = plist;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((plist == null) ? 0 : plist.hashCode());
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
		if (plist == null) {
			if (other.plist != null)
				return false;
		} else if (!plist.equals(other.plist))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Stores [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	} 
	
	public double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException{
	for (Product prod:plist) {
		if (prod.getProductId() == productCode) {
			 prod.setQuantityOnHand(prod.getQuantityOnHand()-qtyRequired);
			 if (prod.getQuantityOnHand() <= prod.getReorderLevel())
				System.out.println("Purchase Order Made"+prod.getReorderQty()); 
			 return (qtyRequired*prod.getPrice());
		}
	}
	throw new ProductNotFoundException("Product is not Available");
	}

	public void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException{
		for (Product prod:plist) {
			if(prod.getProductId() == productCode) {
				prod.setQuantityOnHand(prod.getQuantityOnHand()+arrivedQty);
				return;
			}
		}
	throw new ProductNotFoundException("Product is not Available");
	}
	
}

