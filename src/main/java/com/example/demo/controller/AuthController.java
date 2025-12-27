package com.example.demo.controller;

import com.example.demo.dto.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/register")
    public void register(@RequestBody RegisterRequest request) {
        // handled by service in real app
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        return new AuthResponse("JWT_TOKEN");
    }
}
