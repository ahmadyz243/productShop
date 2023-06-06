package com.yazdi.products.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionController{

    @ExceptionHandler(value = ProductNameNotValidException.class)
    public String productNameNotValidHandle(){
        System.out.println("hhhhhhhhhhhhhhhhhhhh");
        return "";
    }

}
