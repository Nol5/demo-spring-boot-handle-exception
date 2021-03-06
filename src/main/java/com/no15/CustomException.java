package com.no15;

public class CustomException extends RuntimeException {

    private String customMessage;

    public CustomException(){
        super();
    }

    public CustomException(String customMessage){
        super(new Exception(customMessage));
        this.customMessage = customMessage;
    }

    public String getCustomMessage() {
        return customMessage;
    }

}
