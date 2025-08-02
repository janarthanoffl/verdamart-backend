package com.example.Own.VerdaMart.Controller;

import com.example.Own.VerdaMart.Dto.UserRegistrationDto;
import com.example.Own.VerdaMart.Service.ProductService;
import com.example.Own.VerdaMart.Service.UserService;
import com.example.Own.VerdaMart.model.product;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class AuthRestController {

    @Autowired
    private UserService userService;

    @Autowired
    ProductService productService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRegistrationDto dto) {
        try {
            userService.registerNewUser(dto);
            return ResponseEntity.ok("Registration successful");
        } catch (RuntimeException ex) {
            return ResponseEntity.badRequest().body("Registration failed: " + ex.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserRegistrationDto loginDto,
                                        HttpServletRequest request) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginDto.getUsername(), loginDto.getPassword())
            );

            if (authentication.isAuthenticated()) {
                // ✅ Set the authenticated user in Spring Security context
                SecurityContextHolder.getContext().setAuthentication(authentication);

                // ✅ Create session manually and store context
                HttpSession session = request.getSession(true); // create session if not exists
                session.setAttribute(
                        HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY,
                        SecurityContextHolder.getContext()
                );

                return ResponseEntity.ok("Login successful. Session ID: " + session.getId());
            }

            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");

        } catch (AuthenticationException ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Login failed: " + ex.getMessage());
        }
    }

    @GetMapping("/availableitems")
    public List<product> AvailableItems() {
        return productService.availableitems();
    }
}
