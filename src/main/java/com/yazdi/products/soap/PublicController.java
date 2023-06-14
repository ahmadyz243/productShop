package com.yazdi.products.soap;

import com.yazdi.products.dto.customer.SignupRequest;
import com.yazdi.products.dto.customer.SignupResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@PropertySource("classpath:application.properties")
public class PublicController {

    @PayloadRoot(namespace = "http://localhost:8080/soap/signup", localPart = "signupRequest")
    @ResponsePayload
    public SignupResponse signup(@RequestPayload SignupRequest signupRequest) {

        System.out.println(signupRequest.getFirstname());

        return new SignupResponse("aaaa", "bbbbb", "username", "pass", "userrr");

    }

}
