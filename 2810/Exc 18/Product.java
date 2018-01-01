package com.htc.Exc2;

public class Product implements Comparable<Product>{
	
	private String productName;
	private double price;
	private int quantityOnHand;
	private int reorderLevel;
	private int reorderQty;
	
	public Product() {
		super();
		this.productId = 0;
		this.productName = null;
		this.price = 0;
		this.quantityOnHand = 0;
		this.reorderLevel = 0;
		this.reorderQty = 0;
	}	
	
	public Product(int productId, String productName, double price, int quantityOnHand, int reorderLevel,
			int reorderQty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantityOnHand = quantityOnHand;
		this.reorderLevel = reorderLevel;
		this.reorderQty = reorderQty;
	}

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
	private int productId;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + productId;
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
		if (productId != other.productId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", quantityOnHand=" + quantityOnHand
				+ ", reorderLevel=" + reorderLevel + ", reorderQty=" + reorderQty + ", productId=" + productId + "]";
	}

	@Override
	 public int compareTo(Product p)
	 {
		 return p.productId-this.productId;
	    
	 }

	
}
