package com.example.rajkonkret.jsoupipchone.service;

import com.example.rajkonkret.jsoupipchone.model.UserDto;
import com.example.rajkonkret.jsoupipchone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
//    @Autowired
//    UserDTOREpository userDTOREpository;

//    public List<User> findAllUsers() {
//        return userRepository.findAll();
//    }
    public Collection<UserDto> findAllUsers() {

        System.out.println( userRepository.findAllUserDto());
        return userRepository.findAllUserDto();
    }
}
