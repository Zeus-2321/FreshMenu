package com.example.springsecurity.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {

    private AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody RegisterRequest request
    ){
        return  ResponseEntity.ok( service.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<Object> register(@RequestBody Authenticationrequest request
    ){
        return  ResponseEntity.ok( service.  authenticate(request));
    }
}
