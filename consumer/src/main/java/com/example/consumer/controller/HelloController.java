package com.example.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class HelloController {
    @GetMapping("/hello")
    public String greet() {
        return "<h1>Hello from consumer</h1>";
    }
}
