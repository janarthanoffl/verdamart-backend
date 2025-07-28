//package com.example.Own.VerdaMart.Config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//public class sceu {
//
//    @Bean
//public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//    http
//            .csrf().disable()
//            .authorizeHttpRequests()
//            .anyRequest().permitAll()
//            .and()
//            .formLogin().disable();// ⛔ This allows all requests without auth
//
//    return http.build();
//}
//}