package com.htc.dec24;

import java.util.*;

public class Stores {

	private ArrayList<Product> plist;

	/**
	 * @param plist
	 */
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
	
	public double sellItem(String productCode,int qtyRequired)throws ProductNotFoundException
	{
		Stores s = new Stores(plist);
		for(Product psell:plist)
		{
			if(psell.getProductId().equals(productCode))
			{
				if(psell.getQuantityOnHand()>qtyRequired)
				{
					String prodId = psell.getProductId();
					double totAMount = psell.getPrice()*qtyRequired;
					double qtyOnH = psell.getQuantityOnHand()-qtyRequired;
					s.updateStock(prodId, qtyOnH);
					return totAMount;
					
				}
			}
		}
		throw new ProductNotFoundException("Enter Valid product id:");	
	}
	
	public void updateStock(String productCode,double arrivedQty)throws ProductNotFoundException
	{  
		boolean flag = false;
		for(Product psell:plist)
		{
			if(psell.getProductId().equals(productCode))
			{
				flag =true;
				psell.setQuantityOnHand(arrivedQty);
				if(psell.getQuantityOnHand()<=psell.getReorderLevel())
				{
					System.out.println("purchase order need to be raised for :" +psell.getReorderQt()+ " items");
					//break;
					//return s;
				}
				else
				{
					System.out.println("Quantity in Hand is not reached reorder level: QOH =" +psell.getQuantityOnHand());
					//break;
					//return s;
				}
			}
			
		}
		if(!flag)
		{
			throw new ProductNotFoundException("Enter Valid product id:");
		}
		
	}
	
	public void sortByProductName()
	{
		ProductNameComp ProductNameComp = new ProductNameComp();
		Collections.sort(plist,ProductNameComp);
		System.out.println("After sort");
		for (Product p:plist)
		{
			System.out.println(p.getProductId()+" " +p.getProductName()+" "+p.getPrice()+""
									+p.getQuantityOnHand()+" "+p.getReorderLevel()+" "+p.getReorderQt());
		}
		
	}
}

	