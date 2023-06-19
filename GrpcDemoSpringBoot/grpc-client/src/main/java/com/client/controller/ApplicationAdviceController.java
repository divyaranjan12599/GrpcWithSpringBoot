package com.client.controller;

import com.client.ExceptionFolder.EmployeeNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationAdviceController {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public Map<String,String> handle12(EmployeeNotFoundException ex)
    {

        Map<String,String> errormap=new HashMap<>();
        errormap.put("error message",ex.getMessage());
        return errormap;
    }

}
