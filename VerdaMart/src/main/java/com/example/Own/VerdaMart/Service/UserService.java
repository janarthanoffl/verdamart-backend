package com.example.Own.VerdaMart.Service;

import com.example.Own.VerdaMart.Dto.UserRegistrationDto;
import com.example.Own.VerdaMart.model.User;
import com.example.Own.VerdaMart.Reposotory.UserRepository;
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

    public void registerNewUser(UserRegistrationDto dto) {
        if (userRepository.findByUsername(dto.getUsername()).isPresent()) {
            throw new RuntimeException("Username already exists");
        }

        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));

        // set default role if none provided
        Set<String> roles = dto.getRoles().isEmpty() ? Set.of("USER") : dto.getRoles();
        user.setRoles(roles);

        userRepository.save(user);
    }
}
