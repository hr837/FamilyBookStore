package com.duang.book.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class Greeting {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
