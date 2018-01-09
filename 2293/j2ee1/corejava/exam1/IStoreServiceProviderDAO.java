package j2ee1.corejava.exam1;

import java.sql.SQLException;

public interface IStoreServiceProviderDAO {
	public Product searchProduct(int productCode) throws ProductNotAvailableException, SQLException;
	public void updateProduct(int productCode, double productPrice) throws ProductNotAvailableException, SQLException;
}
