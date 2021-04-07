package com.example.rajkonkret.jsoupipchone.service;

import com.example.rajkonkret.jsoupipchone.model.User2;
import com.example.rajkonkret.jsoupipchone.model.UserDto;
import com.example.rajkonkret.jsoupipchone.repository.UserRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Collection<UserDto> findAllUsers() {

        Set<User2> listOfUsers = userRepository.findAllUsers();
        log.info(listOfUsers.toString());
        return listOfUsers.stream()
                .map(user -> new UserDto(
                        user.getName(),
                        user.getSurname(),
                        user.getPesel(),
                        user.getVisits()
                ))
                .collect(Collectors.toList());

    }
}
