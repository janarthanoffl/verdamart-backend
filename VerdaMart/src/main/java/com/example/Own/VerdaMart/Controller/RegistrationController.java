package com.example.Own.VerdaMart.Controller;

import com.example.Own.VerdaMart.Dto.UserRegistrationDto;
import com.example.Own.VerdaMart.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto,
                                      BindingResult result) {
        try {
            userService.registerNewUser(registrationDto);
        } catch (RuntimeException ex) {
            result.rejectValue("username", null, ex.getMessage());
            return "registration";
        }

        return "redirect:/registration?success";
    }
}