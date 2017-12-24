public class EmployeeNotFoundException extends Exception {
    private String errorMessage;

    public EmployeeNotFoundException(String errorMessage) {
        this.errorMessage = errorMessage;
        System.out.println(errorMessage);
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
