package Exercise15;

import java.util.ArrayList;
import java.util.Collections;

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
        return "Exercise15.Stores{" +
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

    public ArrayList<Product> sortProduct(ArrayList prodList){
        Collections.sort(prodList);
        Collections.reverse(prodList);
        return prodList;
    }

}
