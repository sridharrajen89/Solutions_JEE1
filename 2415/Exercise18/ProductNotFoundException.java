package Exercise18;

public class ProductNotFoundException extends Exception {
    private String errorMessage;
    public ProductNotFoundException (String errorMessage){
        this.errorMessage= errorMessage;
        System.out.println(errorMessage);
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
