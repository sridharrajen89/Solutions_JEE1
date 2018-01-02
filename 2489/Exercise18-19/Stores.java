package com.htc.exe2;

import java.util.ArrayList;
import java.util.Comparator;

public class Stores implements Comparator<Product> {
	ArrayList<Product> plist = new ArrayList<Product>();

	public Stores(ArrayList<Product> plist) {
		super();
		this.plist = plist;
	}
	
	public double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException{
		double total = 0;
		for(Product prod: plist)
		{
			if(prod.getProductID()== productCode) {
				if(prod.getQuantityOnHand()>= qtyRequired) {
					total = (prod.getPrice()* qtyRequired);
					prod.setQuantityOnHand(prod.getQuantityOnHand()- qtyRequired);
				}
				if(prod.getQuantityOnHand()<=prod.getReorderLevel()) {
					updateStock(productCode, prod.getReorderQty());
				}
				return total;
			}else
				throw new ProductNotFoundException("Product out of stock in store");
		}
		throw new ProductNotFoundException("Product not found"); 
	}
	public void updateStock(int productCode, int arrivedQty)throws ProductNotFoundException{
		System.out.println("Updating Stock for : " +productCode);
		boolean found = false;
		for(Product prod: plist) {
			if(prod.getProductID()== productCode) {
				prod.setQuantityOnHand(prod.getQuantityOnHand()+arrivedQty);
				System.out.println("purchase order is made");
				found = true;
			}
		} 
		if (found == false)
		throw new ProductNotFoundException("Invalid product to update"); 
		
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
		return "Stores [plist=" + plist + "]";
	}

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stu
		if(p1.getPrice()<p2.getPrice()) return -1;
		if(p1.getPrice()<p2.getPrice()) return 1;
		else return 0;
	}


}
