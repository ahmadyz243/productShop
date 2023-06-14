package com.yazdi.products.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {

    @GetMapping
    public String welcome(){
        return "index";
    }

    @GetMapping("/signup-page")
    public String signupPage(){
        return "signup-page";
    }

}