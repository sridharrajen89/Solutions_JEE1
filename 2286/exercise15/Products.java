package com.java.training.exercise15.stores;

@SuppressWarnings("rawtypes")
public class Products implements Comparable{
	private int productId; 
	private String productName;
	private double price; 
	private int quantityOnHand;
	private int reorderLevel;
	private int reorderQty;
	
	//Default Constructor
	
	public Products() {
		super();
	}

	//overloaded Constructor
public Products(int productId, String productName, double price, int quantityOnHand, int reorderLevel, int reorderQty) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.price = price;
	this.quantityOnHand = quantityOnHand;
	this.reorderLevel = 10;
	this.reorderQty = 50;
}

//Getter & Setter
public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getQuantityOnHand() {
	return quantityOnHand;
}

public void setQuantityOnHand(int quantityOnHand) {
	this.quantityOnHand = quantityOnHand;
}

public int getReorderLevel() {
	return reorderLevel;
}

public void setReorderLevel(int reorderLevel) {
	this.reorderLevel = reorderLevel;
}

public int getReorderQty() {
	return reorderQty;
}

public void setReorderQty(int reorderQty) {
	this.reorderQty = reorderQty;
}

@Override
public String toString()
{

	return "[productId= " + productId + "productName= " + 
	productName + "price= " + price + "quantityOnHand= "  + 
	quantityOnHand + "reorderLevel= " + reorderLevel + 
	"reorderQty= " + reorderQty;
}

@Override
public int compareTo(Object compareProduct) {
	int compareProductID = ((Products)compareProduct).getProductId();
	return this.productId-compareProductID;
}

	
}
