package com.htcinc.weektwo;

public class ProductNotFoundException extends Exception {

private String errorMessage;

public ProductNotFoundException(String errorMessage) {
this.errorMessage = errorMessage;
}

public String getErrorMessage( ) {
return errorMessage;
}

}

