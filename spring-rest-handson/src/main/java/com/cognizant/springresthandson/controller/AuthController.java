package com.cognizant.springresthandson.controller;

import com.cognizant.springresthandson.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    // Evaluates access headers to provide signed transaction signatures
    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        String token = jwtUtil.generateToken("test_user");
        return Map.of("token", token);
    }
}