//package com.example.Own.VerdaMart.Controller;
//
//import com.example.Own.VerdaMart.Dto.LoginRequestDto;
//import com.example.Own.VerdaMart.Dto.UserDto;
//import com.example.Own.VerdaMart.Reposotory.UserRepository;
//import com.example.Own.VerdaMart.Service.UserService;
//import com.example.Own.VerdaMart.model.Role;
//import com.example.Own.VerdaMart.model.User;
//import jakarta.servlet.http.HttpSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//@RestController("/auth")
////@RequestMapping("/api/users")
//public class UserController {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Autowired private UserService userService;
////    @Autowired private FarmerService farmerService;
//
//    // Register as customer
//    @PostMapping("/register")
//    public String register(@RequestBody UserDto dto) {
//        userService.registerCustomer(dto);
//        return "Registered as Customer!";
//    }
//
//    @GetMapping("/register/welcome")
//    public String welcome() {
//        return "Welcome!";
//    }
//
//    @PostMapping("/login")
//    public String login(@RequestBody User user) {
//        Optional<User> authenticatedUser = userService.authenticateUser(user.getEmail(), user.getPassword());
//        return authenticatedUser.isPresent() ? "Login successful" : "Invalid credentials";
//    }
//
//
//
////    @GetMapping("/{username}")
////    public ResponseEntity<UserDto> getUser(@PathVariable String username) {
////        User user = userService.getUserByUsername(username);
//////        return ResponseEntity.ok(new UserDto(user));
////
////    }
//
//}
