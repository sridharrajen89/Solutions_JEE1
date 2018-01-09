package j2ee1.corejava.exam1;

@SuppressWarnings("serial")
public class DuplicateBookIDException extends Exception {

	final String errorMessage = "Duplicate Product Id, Consider new Id";

	public String getErrorMessage() {

		return errorMessage;

	}
}
