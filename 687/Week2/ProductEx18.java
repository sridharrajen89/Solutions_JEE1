
package com.core.java;
import java.io.*;
import java.util.*;
import java.util.*;
/**
 * @author Radhika
 *
 */
// Exercise 18 - Write a class Product, with following data members and member functions for accomplishing the given requirements.  
// Fields: productId, productName, price, quantityOnHand, reorderLevel, reorderQty 	

// Exercise 19 - Sorts Product by Price in Ascending Order 

	class Product implements Serializable, Comparable<Product> {
		  /**
		 * 
		 */
		  private static final long serialVersionUID = 1L;
		  private int productId;
		  private String productName;
		  private double price;
		  private int quantityOnHand;
		  private int reorderLevel;
		  private int reorderQty;
		/**
		 * 
		 */
		public Product() {
			super();
			this.productId = 0;
			this.productName = "";
			this.price = 0;
			this.quantityOnHand = 0;
			this.reorderLevel = 0;
			this.reorderQty = 0;
		}
		/**
		 * @param productId
		 * @param productName
		 * @param price
		 * @param quantityOnHand
		 * @param reorderLevel
		 * @param reorderQty
		 */
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
		/**
		 * @return the productId
		 */
		public int getProductId() {
			return productId;
		}
		/**
		 * @param productId the productId to set
		 */
		public void setProductId(int productId) {
			this.productId = productId;
		}
		/**
		 * @return the productName
		 */
		public String getProductName() {
			return productName;
		}
		/**
		 * @param productName the productName to set
		 */
		public void setProductName(String productName) {
			this.productName = productName;
		}
		/**
		 * @return the price
		 */
		public double getPrice() {
			return price;
		}
		/**
		 * @param price the price to set
		 */
		public void setPrice(double price) {
			this.price = price;
		}
		/**
		 * @return the quantityOnHand
		 */
		public int getQuantityOnHand() {
			return quantityOnHand;
		}
		/**
		 * @param quantityOnHand the quantityOnHand to set
		 */
		public void setQuantityOnHand(int quantityOnHand) {
			this.quantityOnHand = quantityOnHand;
		}
		/**
		 * @return the reorderLevel
		 */
		public int getReorderLevel() {
			return reorderLevel;
		}
		/**
		 * @param reorderLevel the reorderLevel to set
		 */
		public void setReorderLevel(int reorderLevel) {
			this.reorderLevel = reorderLevel;
		}
		/**
		 * @return the reorderQty
		 */
		public int getReorderQty() {
			return reorderQty;
		}
		/**
		 * @param reorderQty the reorderQty to set
		 */
		public void setReorderQty(int reorderQty) {
			this.reorderQty = reorderQty;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + productId;
			return result;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
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
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
					+ ", quantityOnHand=" + quantityOnHand + ", reorderLevel=" + reorderLevel + ", reorderQty="
					+ reorderQty + "]";
		}
		@Override
		public int compareTo(Product o) {
			// TODO Auto-generated method stub
			return o.reorderLevel-this.reorderLevel;
		}
		 
	}

	// User defined exceptions

	class ProductNotFoundException extends Exception{
	  /**
		 * 
		 */
	    private String errorMessage;
	    
		/**
		 * @param errorMessage
		 */
		public ProductNotFoundException(String errorMessage) {
			super();
			this.errorMessage = errorMessage;
		}

		/**
		 * @return the errorMessage
		 */
		public String getErrorMessage() {
			return errorMessage;
		}
	  
	}

	class Stores implements Serializable{
		   /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
        private ArrayList<Product> prodList; 

		/**
		 * 
		 */
		public Stores() {
			super();
			this.prodList = null;
		}
		
		
		/**
		 * @param prodList
		 */
		public Stores(ArrayList<Product> prodList) {
			super();
			this.prodList = prodList;
		}

		/**
		 * @return the prodList
		 */
		public ArrayList<Product> getProdList() {
			return prodList;
		}


		/**
		 * @param prodList the prodList to set
		 */
		public void setProdList(ArrayList<Product> prodList) {
			this.prodList = prodList;
		}


		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((prodList == null) ? 0 : prodList.hashCode());
			return result;
		}


		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Stores other = (Stores) obj;
			if (prodList == null) {
				if (other.prodList != null)
					return false;
			} else if (!prodList.equals(other.prodList))
				return false;
			return true;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Stores [prodList=" + prodList + "]";
		}


		/**
		 * double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException:  
		 * It should sell the required qty and show the total amount.         
		 * This method also checks whether reorderLevel is reached. If yes, raise a purchase order.   
		 */
		  public double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException{
			  for (Product prod:prodList) {
			   if (prod.getProductId() == productCode) {
					   prod.setQuantityOnHand(prod.getQuantityOnHand()-qtyRequired);
					   if (prod.getQuantityOnHand() <= prod.getReorderLevel())
						   System.out.println("purchase order is made for "+prod.getReorderQty());
					   return (qtyRequired*prod.getPrice());
				   }
			  }
			  
			  throw new ProductNotFoundException("Product is not found");
		  }
		  
		  // void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException 
		  public void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException{
			  for (Product prod:prodList) {
				   if (prod.getProductId() == productCode) {
					  prod.setQuantityOnHand(prod.getQuantityOnHand()+arrivedQty);
					  return;
				   } 
			   }
				  throw new ProductNotFoundException("Product is not found");
		  }
		
	}
	
	// Ex 19 - Sorts Product by Price in Ascending Order
	
	class ProductCompare implements Comparator<Product>
	{
	   public int compare(Product p1, Product p2)
	   {
	     if (p1.getPrice() < p2.getPrice()) return -1;
	     if (p1.getPrice() > p2.getPrice()) return 1;
	     else return 0;
	   }
	}


	public class ProductEx18 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product p1;
		ArrayList<Product> prodList = new ArrayList<Product>();
	    try {
		   p1 = new Product(001,"Chocolate",30,30,10,50);
	       prodList.add(p1);
		   p1 = new Product(002,"Cake",50,20,10,40);
	       prodList.add(p1);
		   p1 = new Product(003,"Biscuit",20,50,15,60);
	       prodList.add(p1);
		   p1 = new Product(004,"Puff",40,25,10,50);
	       prodList.add(p1);
		   p1 = new Product(005,"Cookie",25,30,10,40);
	       prodList.add(p1);

	       Stores s1 = new Stores (prodList);
	       System.out.println(s1.sellItem(001, 40));
	       System.out.println(s1);	       
	       s1.updateStock(002,40);
	       System.out.println(prodList.get(001));
	       
	        ProductCompare productCompare = new ProductCompare();
	        Collections.sort(prodList, productCompare);
		    System.out.println(s1);	 
		    
	        ProductNameCompare productNameCompare = new ProductNameCompare();
	        Collections.sort(prodList, productNameCompare);
		    System.out.println(s1);	
	    }
	    catch(ProductNotFoundException PNF){
	    	System.out.println("In ProductNotFoundException");
	    	PNF.printStackTrace();
	       }
	    catch(Exception ex){
	    	System.out.println("In Exception");
	    	ex.printStackTrace();
	       }
	    finally {
	    	System.out.println("In Finally");
	    	prodList.clear();
	    }
	}


}