package com.example.Own.VerdaMart.Controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Map;

@RestController


public class HomeController {



    @GetMapping("/api/user/profile")
    public String getProfile(Principal principal) {
        String username = principal.getName(); // this is the currently logged-in user
        return "Welcome, " + username;
    }
}
