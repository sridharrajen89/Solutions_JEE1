package com.htc.exe2;

public class Product {
	private int productID;
	private String productName;
	private double price;
	private int quantityOnHand;
	private int reorderLevel;
	private int reorderQty;
	
	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + productID;
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
		Product other = (Product) obj;
		if (productID != other.productID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price
				+ ", quantityOnHand=" + quantityOnHand + ", reorderLevel=" + reorderLevel + ", reorderQty=" + reorderQty
				+ "]";
	}

	public Product() {
		super();
		productID = 0;
		productName = "";
		price = 0;
		quantityOnHand = 0;
		reorderLevel = 0;
		reorderQty = 0;
	}

	public Product(int productID, String productName, double price, int quantityOnHand, int reorderLevel,
			int reorderQty) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.quantityOnHand = quantityOnHand;
		this.reorderLevel = reorderLevel;
		this.reorderQty = reorderQty;
	}
	
}
