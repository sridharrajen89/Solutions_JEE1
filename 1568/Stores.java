package com.htcinc.weektwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Stores implements IProductServiceProvider {

HashMap<Integer, Product> productMap = new HashMap<Integer, Product>();

//Default constructor
public Stores() {
	super();
	productMap = null;
}

//Method overload constructor
public Stores(HashMap<Integer, Product> productMap) {
	super();
	this.productMap = productMap;
}

//toString method Override
@Override
public String toString() {
	return "Stores [productMap=" + productMap + "]";
}

//sellItem method
public double sellItem(int productId, int qtyRequired) throws ProductNotFoundException 
{
	if(productMap.get(productId) == null)
		throw new ProductNotFoundException("Product not Found");
	else
	{
		int qtyHand = productMap.get(productId).getQuantityOnHand();
		qtyHand = qtyHand - qtyRequired;
		productMap.get(productId).setQuantityOnHand(qtyHand);
		if(qtyHand <= 10)
		{
			productMap.get(productId).setReorderLevel(true);
			productMap.get(productId).setReorderQuantity(50);
			System.out.println("Purchase the Order");
		}
		return productMap.get(productId).getPrice() * qtyRequired;
}

}

// updateStock method
public void updateStock(int productId, int arrivedQty) throws ProductNotFoundException {
	if(productMap.get(productId) == null)
		throw new ProductNotFoundException("Product not Found");
	else
	{
		int qtyHand = productMap.get(productId).getQuantityOnHand();
		System.out.println("Quantity in Hand "+qtyHand);
		qtyHand = qtyHand + arrivedQty;
		productMap.get(productId).setQuantityOnHand(qtyHand);
		productMap.get(productId).setReorderLevel(false);
		productMap.get(productId).setReorderQuantity(0);
	}
}

public static void printMap(Map mp) {
	    Iterator it = mp.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	    }
	}
}