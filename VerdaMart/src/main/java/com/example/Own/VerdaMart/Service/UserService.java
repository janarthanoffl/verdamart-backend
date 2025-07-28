//package com.example.Own.VerdaMart.Service;
//
//import com.example.Own.VerdaMart.Dto.UserDto;
//import com.example.Own.VerdaMart.Reposotory.UserRepository;
//import com.example.Own.VerdaMart.model.Role;
//import com.example.Own.VerdaMart.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class UserService {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    public void registerCustomer(UserDto dto) {
//        User user = new User();
//        user.setUsername(dto.username);
//        user.setEmail(dto.email);
//        user.setPassword(passwordEncoder.encode(dto.password));
//        user.setRole(Role.ROLE_CUSTOMER);
//        userRepository.save(user);
//    }
//    public Optional<User> authenticateUser(String username, String password) {
//        Optional<User> user = userRepository.findByUsername(username);
//        if (user.isPresent() && passwordEncoder.matches(password, user.get().getPassword())) {
//            return user;
//        }
//        return Optional.empty();
//    }
//
//
//
//}
