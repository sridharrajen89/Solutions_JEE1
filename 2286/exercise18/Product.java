package com.java.training.exercise18.product;

public class Product {
	private int productId; 
	private String productName;
	private double price; 
	private int quantityOnHand;
	private int reorderLevel;
	private int reorderQty;
	
	//Default Constructor
	
	public Product() {
		super();
	}

	//overloaded Constructor
public Product(int productId, String productName, double price, int quantityOnHand, int reorderLevel, int reorderQty) {
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
	

	
}
