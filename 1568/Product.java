package com.htcinc.weektwo;

public class Product {
	
	//Data members
	private int productId;
	private String productName;
	private double price;
	private int quantityOnHand;
	private boolean reorderLevel;
	private int reorderQuantity;
	
	//Default constructor
	public Product( ) {
		super();
		productId = 0;
		productName = "";
		price = 0;
		quantityOnHand = 0;
		reorderLevel = false;
		reorderQuantity = 0;
	}

	//Method overload constructor
	public Product(int productId, String productName, double price, int quantityOnHand, boolean reorderLevel,
			int reorderQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantityOnHand = quantityOnHand;
		this.reorderLevel = reorderLevel;
		this.reorderQuantity = reorderQuantity;
	}

	//Setters and Getters
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

	public boolean isReorderLevel() {
		return reorderLevel;
	}

	public void setReorderLevel(boolean reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public int getReorderQuantity() {
		return reorderQuantity;
	}

	public void setReorderQuantity(int reorderQuantity) {
		this.reorderQuantity = reorderQuantity;
	}

	//hashCode method override
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + productId;
		return result;
	}
	
	//equals method override
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

	//toString method override
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", quantityOnHand=" + quantityOnHand + ", reorderLevel=" + reorderLevel + ", reorderQuantity="
				+ reorderQuantity + "]";
	}

	
}