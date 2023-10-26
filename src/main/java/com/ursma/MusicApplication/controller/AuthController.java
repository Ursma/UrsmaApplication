package com.ursma.MusicApplication.controller;

import com.ursma.MusicApplication.dto.JwtResponse;
import com.ursma.MusicApplication.dto.UserDto;
import com.ursma.MusicApplication.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;
    @PostMapping
    public ResponseEntity<JwtResponse> getAuthToken(@RequestBody UserDto userDto){
        return null;
    }
}
