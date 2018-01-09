package j2ee1.corejava.exam1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAOImpl implements IStoreServiceProviderDAO {

	Connection con;
	ResultSet rs;

	public ProductDAOImpl() {
		try {
			con = new DBConnector().getConnection();

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	@Override
	public Product searchProduct(int productCode) throws ProductNotAvailableException, SQLException {
		CallableStatement cs = con.prepareCall("{call selectproductrecord(?)}");

		cs.setInt(1, productCode);
		rs = cs.executeQuery();
		Product product = new Product();

		if (rs.next()) {

			product.setProductId((int) rs.getObject(1));

			product.setPrice((double) rs.getObject(2));

			product.setProductName((String) rs.getObject(3));

			return product;

		}

		throw new ProductNotAvailableException("Product is not available with given product code");
	}

	@Override
	public void updateProduct(int productCode, double productPrice) throws ProductNotAvailableException, SQLException {
		CallableStatement stmt = con.prepareCall("{call updateproductrecord(?,?)}");

		stmt.setInt(1, productCode);

		stmt.setDouble(2, productPrice);

		int recCound = stmt.executeUpdate();

		if (recCound != 0) {
			throw new ProductNotAvailableException("Product is not available with given product code");
		}

	}

}
