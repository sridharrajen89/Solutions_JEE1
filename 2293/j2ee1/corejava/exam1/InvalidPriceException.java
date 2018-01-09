package j2ee1.corejava.exam1;

@SuppressWarnings("serial")
public class InvalidPriceException extends Exception {

	private String errorMessage;

	public InvalidPriceException(String errorMessage) {

		this.errorMessage = errorMessage;

	}

	public String getErrorMessage() {

		return errorMessage;

	}
}
