package com.cognizant.springresthandson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Simple confirmation endpoint to test connection status
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!!";
    }
}