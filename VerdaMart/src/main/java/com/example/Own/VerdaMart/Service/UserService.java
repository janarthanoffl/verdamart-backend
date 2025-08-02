package com.example.Own.VerdaMart.Service;

import com.example.Own.VerdaMart.Dto.UserRegistrationDto;
import com.example.Own.VerdaMart.Reposotory.UserRepository;
import com.example.Own.VerdaMart.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerNewUser(UserRegistrationDto registrationDto) {
        if (userRepository.existsByUsername(registrationDto.getUsername())) {
            throw new RuntimeException("Username already exists");
        }

        if (!registrationDto.getPassword().equals(registrationDto.getConfirmPassword())) {
            throw new RuntimeException("Passwords don't match");
        }

        User user = new User();
        user.setUsername(registrationDto.getUsername());
        user.setPassword(passwordEncoder.encode(registrationDto.getPassword()));

        // Assign default role if none provided
        if (registrationDto.getRoles() == null || registrationDto.getRoles().isEmpty()) {
            user.setRoles(Set.of("USER"));
        } else {
            user.setRoles(registrationDto.getRoles());
        }

        return userRepository.save(user);
    }

    public boolean userExists(String username) {
        return userRepository.existsByUsername(username);
    }
}