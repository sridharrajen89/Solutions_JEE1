package test.com;
import java.util.*;

public class Storesmain implements IProductServiceProvider{
	
	   private HashMap<Integer,Products> prdmap=new HashMap<Integer,Products>();
	   
	   
//Default constructor
   public Storesmain() {
			super();
			prdmap=null;

   }
//overloaded constructor

	public Storesmain(HashMap<Integer, Products> prdmap) {
		super();
		this.prdmap = prdmap;
	}
	
//getters and setters
	public HashMap<Integer, Products> getPrdmap() {
		return prdmap;
	}


	public void setPrdmap(HashMap<Integer, Products> prdmap) {
		this.prdmap = prdmap;
	}


	@Override
	public String toString() {
		return "Storesmain [prdmap=" + prdmap + "]";
	}

		
	//method to sellItem
	public double sellItem(int productCode,int qtyRequired) throws ProductNotFoundException{
		
			if (prdmap.get(productCode)==null) 
				throw new ProductNotFoundException("Product is not found");
			else {
				
				int qty = prdmap.get(productCode).getQuantityOnHand();
				qty = qty-qtyRequired;
				prdmap.get(productCode).setQuantityOnHand(qty);
			
				if (qty<=10) {
							prdmap.get(productCode).setReorderLevel(10);
							System.out.println("Purchase order is made");
				}
			}
					
		return prdmap.get(productCode).getPrice() * qtyRequired;
		
	}
	
//method to updatestock
	public void updateStock(int productCode,int arrivedQty) throws ProductNotFoundException {
		
		if (prdmap.get(productCode)==null) 
			throw new ProductNotFoundException("Product is not found");
		else {
				int qty = prdmap.get(productCode).getQuantityOnHand();
				qty = qty+arrivedQty;
				prdmap.get(productCode).setQuantityOnHand(qty);
		}
		
	}

	
	public static void main(String[] args) {
		
		HashMap<Integer,Products> prdmap = new HashMap<Integer,Products>();
		
		prdmap.put(1,new Products(123,"Autospares",25.5,60,10,50));
				
		Storesmain handleproduct=new Storesmain(prdmap);
		
		System.out.println(handleproduct.toString());
		
		try {
			
				System.out.println("Total sale cost..."+handleproduct.sellItem(1,70));
		}
		catch (ProductNotFoundException pnf) {
			pnf.printStackTrace();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		try {
		handleproduct.updateStock(1,50);
		System.out.println("After stock update..."+handleproduct.toString());
		}
		
		catch (ProductNotFoundException pnf) {
			pnf.printStackTrace();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
