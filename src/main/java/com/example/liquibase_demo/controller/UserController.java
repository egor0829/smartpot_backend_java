package com.example.liquibase_demo.controller;

import com.example.liquibase_demo.entity.User;
import com.example.liquibase_demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @GetMapping("/user/all")>
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public List<User> allUsers(@RequestBody) {
        return userRepository.findAll();
    }
}
