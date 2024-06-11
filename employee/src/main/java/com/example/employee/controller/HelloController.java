package com.example.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class HelloController {
    @GetMapping("/hello")
    public String greet() {
        return "<h1>Hello from employee</h1>";
    }
}
