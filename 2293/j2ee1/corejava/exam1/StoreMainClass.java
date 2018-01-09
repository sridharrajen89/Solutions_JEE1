package j2ee1.corejava.exam1;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StoreMainClass {
	public static void main(String[] args) {

		final Logger LOGGER = Logger.getLogger(Class.class.getName());

		HashMap<Integer, Product> productMap = new HashMap<Integer, Product>();

		productMap.put(001, new Product(001, "P001", 1000.0));

		productMap.put(002, new Product(002, "P002", 1100.0));

		productMap.put(003, new Product(003, "P003", 1200.0));

		productMap.put(004, new Product(004, "P004", 1300.0));

		productMap.put(005, new Product(005, "P005", 1400.0));

		Store storeObject = new Store(1, "Walmart", productMap);

		System.out.println(storeObject.toString());

		Product productObj = new Product(006, "P006", 999);

		try {

			storeObject.createProduct(productObj);

		} catch (DuplicateProductIdException e) {

			LOGGER.log(Level.SEVERE, e.toString());

		} catch (InvalidPriceException e) {

			LOGGER.log(Level.SEVERE, e.toString());

		}

		try {

			storeObject.updateProduct(003, 1099);

		} catch (ProductNotAvailableException e) {

			LOGGER.log(Level.SEVERE, e.toString());

		}

		try {

			productObj = storeObject.readProduct(002);

			System.out.println(productObj);

		} catch (ProductNotAvailableException e) {

			LOGGER.log(Level.SEVERE, e.toString());

		}

		try {

			storeObject.deleteProduct(005);

		} catch (ProductNotAvailableException e) {

			LOGGER.log(Level.SEVERE, e.toString());

		}

		System.out.println(storeObject.toString());

	}

}
