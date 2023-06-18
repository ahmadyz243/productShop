package com.yazdi.products.service;

import com.yazdi.products.dto.AuthenticationRequest;
import com.yazdi.products.dto.AuthenticationResponse;
import com.yazdi.products.dto.RegisterRequest;

public interface AuthenticationService {


    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);
}
