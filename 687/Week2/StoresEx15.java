package com.core.java;
import java.io.*;
import java.util.*;

/**
 * @author Radhika
 *
 */
// Exercise 15 - Create a class Stores with an ArrayList<Product> as its only field, 
// initialize the list in the constructor of stores. 
// Create a method in the Stores class that returns the sorted list. 

	class CStores implements Serializable{
		   /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
        private ArrayList<Product> prodList;// has-A relation ship 

		/**
		 * 
		 */
		public CStores() {
			super();
			this.prodList = null;
		}
		
		
		/**
		 * @param prodList
		 */
		public CStores(ArrayList<Product> prodList) {
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
			CStores other = (CStores) obj;
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
			return "CStores [prodList=" + prodList + "]";
		}
		
		public void sortProductByName () {
	        ProductNameCompare productNameCompare = new ProductNameCompare();
	        Collections.sort(prodList, productNameCompare);
		}
	}
	
	class ProductNameCompare implements Comparator<Product>
	{
	   public int compare(Product p1, Product p2)
	   {
	     return(p1.getProductName().compareTo(p2.getProductName()));
	   }
	}
	
	public class StoresEx15 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product p1;
		ArrayList<Product> prodList = new ArrayList<Product>();
		   p1 = new Product(003,"Chocolate",30,30,10,50);
	       prodList.add(p1);
		   p1 = new Product(004,"Cake",50,20,10,40);
	       prodList.add(p1);
		   p1 = new Product(001,"Biscuit",20,50,15,60);
	       prodList.add(p1);
		   p1 = new Product(002,"Puff",40,25,10,50);
	       prodList.add(p1);
		   p1 = new Product(005,"Cookie",25,30,10,40);
	       prodList.add(p1);

	       CStores s1 = new CStores (prodList);
	       System.out.println(s1);
	       System.out.println(prodList);
	       
	        s1.sortProductByName();
		    System.out.println(s1);	
	}


}