package Exercise5;

public class InsufficientFundException extends Exception {
    private String errorMessage;

    public InsufficientFundException (String errorMessage){
        this.errorMessage= errorMessage;
        System.out.println(errorMessage);
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
