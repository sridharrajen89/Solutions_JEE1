package Exercise18;

import java.util.ArrayList;

public class StoreMain {
    public static void main(String[] args){
        ArrayList<Product> prodList = new ArrayList<Product>();
        prodList.add(new Product(102,"Paste", 50, 11));
        prodList.add(new Product(103,"Brush", 10, 12));
        prodList.add(new Product(101,"Cap", 750, 9));
        Stores str;
        str= new Stores(prodList);
        try {
            System.out.println("Before Selling: " + prodList);
            double total = str.sellItem(103, 3);
            System.out.println("Total: " + total);
            System.out.println("After Purchase: " + prodList);

            str.updateStock(101,25);
            System.out.println("After Stock Update: " + prodList);
        }
        catch (ProductNotFoundException pnfe)
        {
            pnfe.getErrorMessage();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally {
        }

    }
}

