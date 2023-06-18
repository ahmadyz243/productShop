package com.yazdi.products.rest;

import com.yazdi.products.config.JwtUtils;
import com.yazdi.products.dto.AuthenticationRequest;
import com.yazdi.products.dto.AuthenticationResponse;
import com.yazdi.products.dto.RegisterRequest;
import com.yazdi.products.service.AuthenticationService;
import com.yazdi.products.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authService;

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){

        return ResponseEntity.ok(authService.authenticate(request));

    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody RegisterRequest request){

        return ResponseEntity.ok(authService.register(request));

    }

}
