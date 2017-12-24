package Exercise5;

public class InvalidAmountException extends Exception {
    private String errorMessage;

    public InvalidAmountException (String errorMessage){
        this.errorMessage= errorMessage;
        System.out.println(errorMessage);
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
