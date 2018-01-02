package jdbc;

public class DuplicateEmployeeIDException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final String errorMessage = "Duplicate Employee ID";


	public String getErrorMessage() {
        return errorMessage;
    }
}
