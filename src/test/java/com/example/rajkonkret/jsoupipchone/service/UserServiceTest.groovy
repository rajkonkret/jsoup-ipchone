package com.example.rajkonkret.jsoupipchone.service

import com.example.rajkonkret.jsoupipchone.model.User2
import com.example.rajkonkret.jsoupipchone.model.UserDto
import com.example.rajkonkret.jsoupipchone.repository.UserRepository
import groovy.util.logging.Log
import spock.lang.Specification

@Log
class UserServiceTest extends Specification {

    private UserService userService

    private UserRepository userRepository;

    def setup() {
        userService = new UserService()

        userRepository = Stub(UserRepository.class)
        userService.setUserRepository(userRepository)
    }

    def "FindAllUsers"() {
        given: "a user with example values"
        User2 user2 = new User2()
        user2.setId(1L)
        user2.setSurname("Janiak")
        user2.setName("Radek")
        user2.setPesel("7508270987654321")
        user2.setUsername("test")

        Collection<User2> collection = Collections.singletonList(user2)

        and: "alweys return mock user"
        userRepository.findAllUsers() >> collection

        when: "ask for the user"
        List<UserDto> usersFromRepo = userService.findAllUsers()

        then: "we got user"
        log.info(usersFromRepo.get(0).toString())
        !usersFromRepo.isEmpty()
        usersFromRepo.size() == 1
        usersFromRepo.get(0).getPesel() == "7508270987654321"


    }
}
