package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {

    @GetMapping("/")
    public String web(){
        return "index";
    }

    @PostMapping
    public String name(){
        return "admin";
    }
}
