package com.no15;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SampleExceptionHandler {

    @ExceptionHandler({Exception.class})
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public String handleException(Exception ex) {
        //must log exception msg or something useful
        System.out.println("Exception msg : " + ex.getMessage());
        return "Thor god of thunder !!";
    }

    @ExceptionHandler({CustomException.class})
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public String handleCustomException(CustomException ex) {
        //must log exception msg or something useful
        return ex.getCustomMessage();
    }

}
