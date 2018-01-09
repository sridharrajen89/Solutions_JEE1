package j2ee1.corejava.exam1;

public class ProductNotAvailableException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public ProductNotAvailableException(String errorMessage) {

		this.errorMessage = errorMessage;

	}

	public String getErrorMessage( ) {

		return errorMessage;

	}

}
