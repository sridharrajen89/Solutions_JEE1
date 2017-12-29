package test.com;

public interface IProductServiceProvider {
	
	public double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException; 

}

class ProductNotFoundException extends Exception {
	 
	 	private String errorMessage;
	 	
	 	public ProductNotFoundException(String errorMessage) {
	 		this.errorMessage = errorMessage;
	 	}
	 	
	 	public String getErrorMessage( ) {
	 		return errorMessage;
	 	}
	 
	 }
