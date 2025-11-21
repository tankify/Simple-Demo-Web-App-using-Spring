package com.chirag.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Home Screen!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "Hi this is about me!!";
    }

}
