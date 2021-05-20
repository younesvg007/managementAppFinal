package com.example.managementappfinal.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);
        System.out.println(passwordEncoder.encode("younes"));
        System.out.println(passwordEncoder.encode("vegeta"));
        System.out.println(passwordEncoder.encode("michael"));
        System.out.println(passwordEncoder.encode("james"));

    }
}
