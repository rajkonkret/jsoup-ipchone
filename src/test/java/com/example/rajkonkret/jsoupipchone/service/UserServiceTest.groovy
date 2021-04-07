package com.example.rajkonkret.jsoupipchone.service

import com.example.rajkonkret.jsoupipchone.model.User2
import com.example.rajkonkret.jsoupipchone.repository.UserRepository
import groovy.util.logging.Log
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification
import spock.lang.Subject

@Log
@DataJpaTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
class UserServiceTest extends Specification {

    @Subject
    private UserService userService

    @Autowired
    private UserRepository userRepository

    def setup() {

       /* userRepository = Stub(UserRepository.class)*/
        userService = new UserService(userRepository)
        //userService.setUserRepository(userRepository)
    }

    def "FindAllUsers"() {
        given: "a user with example values"
        def user2 = new User2()
        user2.setId(1L)
        user2.setSurname("Janiak")
        user2.setName("Radek")
        user2.setPesel("7508270987654321")
        user2.setUsername("test")

        def collection = Collections.singletonList(user2)


        /*and: "always return mock user"
        userRepository.findAllUsers()*/

        when: "ask for the user"
        def usersFromRepo = userService.findAllUsers()

        then: "we got user"
        log.info(usersFromRepo.toString())
        !usersFromRepo.isEmpty()
        usersFromRepo.size() == 1
        usersFromRepo.get(0).getPesel() == "7501234567899"
    }
}
