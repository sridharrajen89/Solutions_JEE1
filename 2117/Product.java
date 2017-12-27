package com.htc.practice.excecises;

import java.util.ArrayList;

import com.htc.practice.excecises.Product.Stores.ProductNotFoundException;

public class Product {
	
	int productId;
	String productName;
	int price;
	int quantityOnHand;
	int reorderLevel;
	int reorderQty;
	
	

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



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
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
		result = prime * result + productId;
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
		Product other = (Product) obj;
		if (productId != other.productId)
			return false;
		if (reorderLevel != other.reorderLevel)
			return false;
		if (reorderQty != other.reorderQty)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", quantityOnHand=" + quantityOnHand + ", reorderLevel=" + reorderLevel + ", reorderQty=" + reorderQty
				+ "]";
	}



	public Product(int productId, String productName, int price, int quantityOnHand, int reorderLevel, int reorderQty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantityOnHand = quantityOnHand;
		this.reorderLevel = reorderLevel;
		this.reorderQty = reorderQty;
	}


	 public static class Stores{
//		 ArrayList<String> Product = new ArrayList<String>();
		 
		 private ArrayList<Product> productList;

	
		
		public Stores(ArrayList<Product> productList) {
	      super();
          	this.setProductList(productList);
            }
		
		
     double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException{
    	 int totalPrice =0;
    	 int newQtyOnHand;
			for(Product pro:productList) {		
				if(pro.getQuantityOnHand()>=qtyRequired) {
					totalPrice = qtyRequired*pro.getPrice();
					System.out.println("The total cost of purchase is->"+ totalPrice);
					newQtyOnHand = pro.getQuantityOnHand()-qtyRequired;				
					if(newQtyOnHand<=pro.getReorderLevel()){
						System.out.println("The reorder level is reached so Purchase Order is made for a re-order of->>"+ pro.getReorderQty());
					}else {
					System.out.println("The stores has not yet reached the reorder level");
					}			
				}else {
					System.out.println("There is no sufficinet quantity required to purchase");
				}
									
			}
//			return totalPrice;
			return qtyRequired;
		}
		
		public ArrayList<Product> getProductList() {
			return productList;
		}

		public void setProductList(ArrayList<Product> productList) {
			this.productList = productList;
		}

		class ProductNotFoundException extends Exception {

			private static final long serialVersionUID = -5209769626271723057L;

			private String errorMessage;

			public ProductNotFoundException(String errorMessage) {
				super();
				this.errorMessage = errorMessage;
				System.out.println(errorMessage);
			}

			public String getErrorMessage() {
				return errorMessage;
			}

		}
		 
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Product pro;
ArrayList<Product> productList = new ArrayList<Product>();
try {
	pro = new Product(123,"Shoes",20,20,5,20);
	productList.add(pro);
	Stores st = new Stores(productList);
	st.sellItem(123, 30);
	
}
catch(ProductNotFoundException ENF){
	System.out.println("In EmployeeNotFoundException");
	ENF.printStackTrace();
   }
finally{
	productList.clear();
}
	}

}
