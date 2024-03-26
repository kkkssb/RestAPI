package com.sb.pp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello";
    }
}
