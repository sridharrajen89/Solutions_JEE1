package j2ee1.corejava.exam1;

import java.sql.SQLException;

public class ProductDBMain {

	public static void main(String[] args) {
		ProductDAOImpl productDAO = new ProductDAOImpl();

		Product product = new Product();

		try {
			productDAO.updateProduct(004, 1999.99);
		} catch (ProductNotAvailableException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			product = productDAO.searchProduct(004);
			System.out.println(product);
		} catch (ProductNotAvailableException e) {

			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}

}
