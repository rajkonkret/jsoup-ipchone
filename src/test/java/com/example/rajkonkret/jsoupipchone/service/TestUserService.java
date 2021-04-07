package com.example.rajkonkret.jsoupipchone.service;

import com.example.rajkonkret.jsoupipchone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestUserService {

    @Autowired
    private UserRepository userRepository;

    @Bean
    UserService createUserService(){
        return new UserService(userRepository);
    }
}
