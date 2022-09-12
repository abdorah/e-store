package com.eccom.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class WelcomeController {

    @GetMapping
    public String greetingExpressionString() {
        return "Welcome to your prefered store!";
    }
    
}
