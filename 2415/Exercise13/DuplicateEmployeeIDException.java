package ArrayListExample;

public class DuplicateEmployeeIDException extends Exception {
    final String errorMessage = "Duplicate ArrayListExample.Employee ID";

    public String getErrorMessage() {
        return errorMessage;
    }
}
