//package com.example.Own.VerdaMart.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Enumerated;
//import jakarta.persistence.EnumType;
//
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//
//
//@Entity
//public class User {
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    private String username;
//    private String email;
//    private String password;
//
//    @Enumerated(EnumType.STRING)
//    private Role role;
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//    public void setRole(Role role) {
//        this.role = role;
//    }
//}
