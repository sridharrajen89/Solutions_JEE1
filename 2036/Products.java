package test.com;

public class Products {
	
	private int productId;
	private String productName;
	private double price;
	private int quantityOnHand;
	private int reorderLevel;
	private int reorderQty;
	
//default constructor
		public Products() {
			
			this.productId = 0;
			this.productName = "";
			this.price = 0;
			this.quantityOnHand = 0;
			this.reorderLevel = 0;
			this.reorderQty = 0;					
		}
	
//overloaded constructor
	public Products(int productId, String productName, double price, int quantityOnHand, int reorderLevel,
			int reorderQty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantityOnHand = quantityOnHand;
		this.reorderLevel = reorderLevel;
		this.reorderQty = reorderQty;
	}

//Getters and setters
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantityOnHand() {
		return quantityOnHand;
	}
	public int getReorderLevel() {
		return reorderLevel;
	}
	public int getReorderQty() {
		return reorderQty;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	public void setReorderLevel(int reorderLevel) {
		this.reorderLevel = reorderLevel;
	}
	public void setReorderQty(int reorderQty) {
		this.reorderQty = reorderQty;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + quantityOnHand;
		result = prime * result + reorderLevel;
		result = prime * result + reorderQty;
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
		Products other = (Products) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (quantityOnHand != other.quantityOnHand)
			return false;
		if (reorderLevel != other.reorderLevel)
			return false;
		if (reorderQty != other.reorderQty)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", quantityOnHand=" + quantityOnHand + ", reorderLevel=" + reorderLevel + ", reorderQty=" + reorderQty
				+ "]";
	}
	
}
