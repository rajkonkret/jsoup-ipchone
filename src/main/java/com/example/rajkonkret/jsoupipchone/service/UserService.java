package com.example.rajkonkret.jsoupipchone.service;

import com.example.rajkonkret.jsoupipchone.model.User2;
import com.example.rajkonkret.jsoupipchone.model.UserDto;
import com.example.rajkonkret.jsoupipchone.repository.UserRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Slf4j
@Data
@NoArgsConstructor
@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Collection<UserDto> findAllUsers() {

        Collection<User2> listOfUsers = userRepository.findAllUsers();
        log.info(listOfUsers.toString());
        return listOfUsers.stream()
                .map(user -> new UserDto(user.getName(), user.getSurname(), user.getPesel(), user.getVisits()))
                .collect(Collectors.toList());

    }
}
