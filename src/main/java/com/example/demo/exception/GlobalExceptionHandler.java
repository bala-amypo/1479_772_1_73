package com.example.demo.exception;

import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public String handle(ResourceNotFoundException e) {
        return e.getMessage();
    }
}
