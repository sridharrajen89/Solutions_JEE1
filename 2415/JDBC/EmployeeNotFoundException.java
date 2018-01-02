package jdbc;

public class EmployeeNotFoundException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage;

    public EmployeeNotFoundException(String errorMessage) {
        this.errorMessage = errorMessage;
        //System.out.println(errorMessage);
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}