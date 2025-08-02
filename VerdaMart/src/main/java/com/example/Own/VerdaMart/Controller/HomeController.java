package com.example.Own.VerdaMart.Controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/home")
    public Map<String, Object> home(@AuthenticationPrincipal UserDetails userDetails) {
        return Map.of("message", "Welcome!", "user", userDetails.getUsername());
    }
}
