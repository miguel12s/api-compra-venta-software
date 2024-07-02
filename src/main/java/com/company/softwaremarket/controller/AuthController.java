package com.company.softwaremarket.controller;


import com.company.softwaremarket.dto.AuthResponse;
import com.company.softwaremarket.dto.LoginRequest;
import com.company.softwaremarket.dto.RegisterRequest;
import com.company.softwaremarket.models.entities.UserEntity;
import com.company.softwaremarket.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")

public class AuthController {

    private final   AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }


    @PostMapping(value="/login")



    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest loginRequest) {

        return ResponseEntity.ok(authService.login());
    }


@PostMapping(value="/register")

        public ResponseEntity<AuthResponse> register() {

            return ResponseEntity.ok(authService.register());

        }

}
