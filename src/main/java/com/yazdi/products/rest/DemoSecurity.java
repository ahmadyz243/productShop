package com.yazdi.products.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoSecurity {

    @GetMapping("/hello")
    public ResponseEntity<String> satHello(){
        return ResponseEntity.ok("hello from secured endpoint");
    }

}
