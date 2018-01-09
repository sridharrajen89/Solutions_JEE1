package j2ee1.corejava.exam1;

@SuppressWarnings("serial")
public class DuplicateProductIdException extends Exception {

	final String errorMessage = "Product Id already exists";

	public String getErrorMessage( ) {

		return errorMessage;

	}

}
