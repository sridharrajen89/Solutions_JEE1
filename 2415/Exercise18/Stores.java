package Exercise18;

import java.util.ArrayList;
//import java.util.Collections;

public class Stores {

    private ArrayList<Product> prodList;

    public Stores(ArrayList<Product> prodList) {
        this.prodList = prodList;
    }

    public ArrayList<Product> getProdList() {
        return prodList;
    }

    public void setProdList(ArrayList<Product> prodList) {
        this.prodList = prodList;
    }

    @Override
    public String toString() {
        return "Stores{" +
                "prodList=" + prodList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stores stores = (Stores) o;

        return prodList != null ? prodList.equals(stores.prodList) : stores.prodList == null;
    }

    @Override
    public int hashCode() {
        return prodList != null ? prodList.hashCode() : 0;
    }

    public double sellItem(int prodCode, int qtyRequired) throws ProductNotFoundException{
        double total=0;
        for (Product prod: prodList) {
            if (prod.getProductId() == prodCode) {
                //System.out.println(prod.getProductId());
                if (prod.getQuantityOnHand()>=qtyRequired){
                    total = prod.getPrice()*qtyRequired;
                    //System.out.println(total);
                    prod.setQuantityOnHand(prod.getQuantityOnHand()-qtyRequired);
                    if (prod.getQuantityOnHand()<=prod.getReorderLevel()) {
                        updateStock(prodCode,prod.getReorderQty());
//                        prod.setQuantityOnHand(prod.getQuantityOnHand()+ prod.getReorderQty());
//                        System.out.println("A Purchase order is Made for the Product: "+ prodCode);
                    }
                    return total;
                }
                else{
                    throw new ProductNotFoundException("Not enough Quantity of the Item");
                }
            }
        }
        throw new ProductNotFoundException("Product Not Found");
    }
    public void updateStock(int prodCode, int arrivedCode) throws ProductNotFoundException{
        System.out.println("Updating Stock");
        for (Product prod: prodList) {
            if (prod.getProductId() == prodCode) {
                prod.setQuantityOnHand(prod.getQuantityOnHand()+arrivedCode);
                System.out.println("A Purchase order is Made for the Product: "+ prodCode);
                return;
            }
        }
        throw new ProductNotFoundException("Product Not found to Update the stock");
    }
}
