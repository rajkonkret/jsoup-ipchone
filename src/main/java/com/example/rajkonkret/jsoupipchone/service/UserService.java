package com.example.rajkonkret.jsoupipchone.service;

import com.example.rajkonkret.jsoupipchone.model.User2;
import com.example.rajkonkret.jsoupipchone.model.UserDto;
import com.example.rajkonkret.jsoupipchone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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

        //System.out.println( userRepository.findAllUserDto());
        //return userRepository.findAllUserDto();

        Collection<User2> listOfUsers = userRepository.findAllUsers();
        System.out.println(listOfUsers.size());
        return listOfUsers.stream()
                .map(user -> new UserDto(user.getName(), user.getSurname(), user.getPesel(), user.getVisits()))
                .collect(Collectors.toList());
        //return userRepository.findAllUserDto();
    }
}
