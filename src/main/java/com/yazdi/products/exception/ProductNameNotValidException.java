package com.yazdi.products.exception;

import java.io.Serial;

public class ProductNameNotValidException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public String getMessage(){
        return "the file name is not valid";
    }

}