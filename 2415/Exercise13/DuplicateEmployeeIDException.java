public class DuplicateEmployeeIDException extends Exception {
    final String errorMessage = "Duplicate Employee ID";

    public String getErrorMessage() {
        return errorMessage;
    }
}
