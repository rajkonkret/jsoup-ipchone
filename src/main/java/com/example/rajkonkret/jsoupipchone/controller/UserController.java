package com.example.rajkonkret.jsoupipchone.controller;

import com.example.rajkonkret.jsoupipchone.model.User2;
import com.example.rajkonkret.jsoupipchone.model.UserDto;
import com.example.rajkonkret.jsoupipchone.repository.UserRepository;
import com.example.rajkonkret.jsoupipchone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

    @GetMapping
    public Collection<UserDto> getAllUsers() {
        System.out.println(LocalDate.now());
        //return userRepository.findAll();
        return Optional.ofNullable(userService.findAllUsers())
        //        .orElse(Collections.singletonList(new User2()));
       .orElse(Collections.singletonList(new UserDto()));
    }
    @GetMapping("/all")
    public Collection<User2> getAllUsers2(){
        return userRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User2 saveUser(@RequestBody User2 user) {

        System.out.println(user);
        return userRepository.save(user);

    }
}

