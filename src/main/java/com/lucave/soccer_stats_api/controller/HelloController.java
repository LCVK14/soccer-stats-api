package com.lucave.soccer_stats_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World Spring Boot!";
    }
}
