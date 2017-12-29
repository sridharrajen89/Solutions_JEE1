package test.com;
import java.util.*;


public class Stores implements Comparable<Stores>{

	private String productname;
	private int productprice;
	
// Used to sort movies by year
	 @Override
	 public int compareTo(Stores m)
	 {
		 return this.productprice-m.productprice;
		 
		
	 }

//overloaded constructor
	public Stores(String productname, int productprice) {
		super();
		this.productname = productname;
		this.productprice = productprice;
	}
	
//getters

	

	public String getProductname() {
		return productname;
	}

	public int getProductprice() {
		return productprice;
	}

	@Override
	public String toString() {
		return "Stores [productname=" + productname + ", productprice=" + productprice
				+ "]";
	}

	
}
