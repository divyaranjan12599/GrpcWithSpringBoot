package com.client.controller;

import com.client.service.BookAuthorControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Access;

@RestController
public class BookAuthorController {

    @Autowired
    public BookAuthorControllerService bookAuthorControllerService;

    @GetMapping
    public String getauthordetails()
    {

        return bookAuthorControllerService.test();
    }
}
