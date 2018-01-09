package j2ee1.corejava.exam1;

public interface IStoreServiceProvider {
	public Product readProduct(int productCode) throws ProductNotAvailableException;

	public void createProduct(Product product) throws DuplicateProductIdException, InvalidPriceException;

	public void updateProduct(int productCode, double productPrice) throws ProductNotAvailableException;

	public void deleteProduct(int productCode) throws ProductNotAvailableException;
}
