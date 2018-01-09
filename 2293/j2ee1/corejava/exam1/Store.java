package j2ee1.corejava.exam1;

import java.util.HashMap;

public class Store implements IStoreServiceProvider {

	private int storeId;
	private String storeName;
	HashMap<Integer, Product> productMap = new HashMap<Integer, Product>();

	public Store() {

		super();

		this.storeId = 0;

		this.storeName = "";

		this.productMap = null;

	}

	// Method overload constructor

	public Store(int storeId, String storeName, HashMap<Integer, Product> productMap) {

		super();

		this.storeId = storeId;

		this.storeName = storeName;

		this.productMap = productMap;

	}

	// method override for hashCode

	@Override

	public int hashCode() {

		final int prime = 31;

		int result = 1;

		result = prime * result + storeId;

		return result;

	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)

			return true;

		if (obj == null)

			return false;

		if (getClass() != obj.getClass())

			return false;

		Store other = (Store) obj;

		if (storeId != other.storeId)

			return false;

		return true;

	}

	@Override
	public String toString() {

		return "Store [storeId=" + storeId + ", storeName=" + storeName + ", productMap=" + productMap + "]";

	}

	public Product readProduct(int productCode) throws ProductNotAvailableException {

		if (productMap.get(productCode) == null)

			throw new ProductNotAvailableException("Product is not found");

		return productMap.get(productCode);

	}

	public void createProduct(Product product) throws DuplicateProductIdException, InvalidPriceException {

		if (productMap.get(product.getProductId()) != null)

			throw new DuplicateProductIdException();

		if (product.getPrice() < 0)

			throw new InvalidPriceException("Invalid price amount");

		productMap.put(product.getProductId(), product);

	}

	public void updateProduct(int productCode, double productPrice) throws ProductNotAvailableException {

		if (productMap.get(productCode) == null)

			throw new ProductNotAvailableException("Product is not found");

		productMap.get(productCode).setPrice(productPrice);

	}

	public void deleteProduct(int productCode) throws ProductNotAvailableException {

		if (productMap.get(productCode) == null)

			throw new ProductNotAvailableException("Product is not found");

		productMap.remove(productCode);

	}

}
