package com.htc.Exc2;
import java.util.*;
public class TestStores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1;
		ArrayList<Product> plist = new ArrayList<Product>();
		try {
		p1 = new Product(100,"Hamam",25,30,10,40);
		plist.add(p1);
		p1 = new Product(200,"Margo",25,30,10,40);
		plist.add(p1);
		p1 = new Product(400,"Lux",25,30,10,40);
		plist.add(p1);
		p1 = new Product(500,"Dove",25,30,10,40);
		plist.add(p1);
		p1 = new Product(300,"Cinthol",25,30,10,40);
		plist.add(p1);
		Stores S1 = new Stores(plist);
		System.out.println(plist);
		Collections.sort(plist);
		System.out.println("After Sorting"+plist);
	    System.out.println(S1.sellItem(100, 40));
		System.out.println("Selling 100 quantiy 40" +plist);
		S1.updateStock(200,40);
		System.out.println("Update 200 quantiy 40" +plist);
		}
		catch (ProductNotFoundException PNF) {
			PNF.printStackTrace();
		}
		catch (Exception EX) {
			EX.printStackTrace();
		}
		finally {
			plist.clear();
		}
	}
}
