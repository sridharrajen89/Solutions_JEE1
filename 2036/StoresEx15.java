package test.com;
import java.util.*;


   public class StoresEx15 {
	public ArrayList<String> productslist = new ArrayList<String>();
	
		
	@Override
	public String toString() {
		return "StoresEx15 [productslist=" + productslist + "]";
	}
	
	public ArrayList<String> sortproducts (ArrayList<String> sortedlist) {
		
		ArrayList<String> list=new ArrayList<String>(sortedlist);
				
		Collections.sort(list);
		return list;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StoresEx15 newproducts = new StoresEx15();
		
		newproducts.productslist.add(0, "chocolate");
		newproducts.productslist.add(1, "Apples");
		newproducts.productslist.add(2, "Blueberry");
		
		System.out.println("Display products before sorting..."+newproducts.productslist);

		System.out.println("Display products after sorting..."+newproducts.sortproducts(newproducts.productslist));
				
	
	}

}
