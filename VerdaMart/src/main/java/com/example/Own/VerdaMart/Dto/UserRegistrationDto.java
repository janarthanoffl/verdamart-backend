package com.example.Own.VerdaMart.Dto;

import jakarta.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

public class UserRegistrationDto {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    private String confirmPassword;

    private Set<String> roles = new HashSet<>();

    // Getters and Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getConfirmPassword() { return confirmPassword; }
    public void setConfirmPassword(String confirmPassword) { this.confirmPassword = confirmPassword; }

    public Set<String> getRoles() { return roles; }
    public void setRoles(Set<String> roles) { this.roles = roles; }
}
