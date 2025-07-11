package com.cognizant.spring_learn2.controller;

import com.cognizant.spring_learn2.service.JwtService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtService jwtService;

    @GetMapping("/authenticate")
    public String authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Credentials = authHeader.substring("Basic ".length());
            byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(credDecoded);
            String[] values = credentials.split(":", 2);

            String username = values[0];
            String password = values[1];

            // Dummy validation
            if ("user".equals(username) && "pwd".equals(password)) {
                String token = jwtService.generateToken(username);
                return "{\"token\":\"" + token + "\"}";
            }
        }

        return "{\"error\":\"Unauthorized\"}";
    }
}
