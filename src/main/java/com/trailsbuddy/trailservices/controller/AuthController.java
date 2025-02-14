package com.trailsbuddy.trailservices.controller;

import com.trailsbuddy.trailservices.dto.LoginRequest;
import com.trailsbuddy.trailservices.dto.LoginResponse;
import com.trailsbuddy.trailservices.dto.RegisterRequest;
import com.trailsbuddy.trailservices.model.User;
import com.trailsbuddy.trailservices.security.JwtService;
import com.trailsbuddy.trailservices.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;
    private final JwtService jwtService;

    public AuthController(AuthService authService, JwtService jwtService) {
        this.authService = authService;
        this.jwtService = jwtService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        String token = jwtService.generateToken(request.getEmail());
        User user = authService.getUserByEmail(request.getEmail());
        LoginResponse response = new LoginResponse(token, user.getUsername(), user.getEmail());
        return ResponseEntity.ok(response);
    }
}