//package com.example.Own.VerdaMart.Controller;
//
//import com.example.Own.VerdaMart.Dto.UserRegistrationDto;
//import com.example.Own.VerdaMart.Service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/registration")
//public class RegistrationController {
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/reg")
//    public Object registerUserAccount(@RequestBody UserRegistrationDto registrationDto) {
//        try {
//            userService.registerNewUser(registrationDto);
//            return "Registration successful";
//        } catch (RuntimeException ex) {
//            return "Registration failed: " + ex.getMessage();
//        }
//    }
//}