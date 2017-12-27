/**
 * 
 */
package co.htc.CoreJavaExercise2;
import java.util.*;
import java.io.Serializable;

/**
 * @author NishantKumar
 *
 */
public class Product {
private int productId;
private String productName;
private double productPrice;
private int quantityOnHand;
private int reorderLevel;
private int reorderQty;
// Default Consytructor 
public Product() {
	super();
	this.productId = 0;
	this.productName = "";
	this.productPrice = 0.00;
	this.quantityOnHand = 0;
	this.reorderLevel = 0;
	this.reorderQty = 0;
}
/**
 * @param productId
 * @param productName
 * @param productPrice
 * @param quantityOnHand
 * @param reorderLevel
 * @param reorderQty
 */
public Product(int productId, String productName, double productPrice, int quantityOnHand, int reorderLevel,
		int reorderQty) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productPrice = productPrice;
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
/* @return the productName
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
		public double getProductPrice() {
			return productPrice;
		}
		/**
		 * @param price the price to set
		 */
		public void setProductPrice(double productPrice) {
			this.productPrice = productPrice;
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
		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", price=" + productPrice
					+ ", quantityOnHand=" + quantityOnHand + ", reorderLevel=" + reorderLevel + ", reorderQty="
					+ reorderQty + "]";
		}
/*		@Override
		public int compareTo(Product o) {
			// TODO Auto-generated method stub
			return o.reorderLevel-this.reorderLevel;
		}
		 
	}*/

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
        private ArrayList<Product> prodHash; 

		/**
		 * 
		 */
		public Stores() {
			super();
			this.prodHash = null;
		}
		
		
		/**
		 * @param prodHash
		 */
		public Stores(ArrayList<Product> prodHash) {
			super();
			this.prodHash = prodHash;
		}

		/**
		 * @return the prodHash
		 */
		public ArrayList<Product> getprodHash() {
			return prodHash;
		}


		/**
		 * @param prodHash the prodHash to set
		 */
		public void setprodHash(ArrayList<Product> prodHash) {
			this.prodHash = prodHash;
		}


		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((prodHash == null) ? 0 : prodHash.hashCode());
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
			if (prodHash == null) {
				if (other.prodHash != null)
					return false;
			} else if (!prodHash.equals(other.prodHash))
				return false;
			return true;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Stores [prodHash=" + prodHash + "]";
		}


		/**
		 * double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException:  
		 * It should sell the required qty and show the total amount.         
		 * This method also checks whether reorderLevel is reached. If yes, raise a purchase order.   
		 */
		  public double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException{
			  for (Product prod:prodHash) {
			   if (prod.getProductId() == productCode) {
					   prod.setQuantityOnHand(prod.getQuantityOnHand()-qtyRequired);
					   if (prod.getQuantityOnHand() <= prod.getReorderLevel())
						   System.out.println("purchase order is made for "+prod.getReorderQty());
					   return (qtyRequired*prod.getProductPrice());
				   }
			  }
			  
			  throw new ProductNotFoundException("Product is not found");
		  }
		  
		  // void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException 
		  public void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException{
			  for (Product prod:prodHash) {
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
	     if (p1.getProductPrice() < p2.getProductPrice()) return -1;
	     if (p1.getProductPrice() > p2.getProductPrice()) return 1;
	     else return 0;
	   }
	}
}
