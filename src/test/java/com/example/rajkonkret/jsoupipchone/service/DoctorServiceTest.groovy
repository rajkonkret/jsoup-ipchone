package com.example.rajkonkret.jsoupipchone.service

import com.example.rajkonkret.jsoupipchone.model.Doctor
import com.example.rajkonkret.jsoupipchone.repository.DoctorRepository
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
class DoctorServiceTest extends Specification {

    @Subject
    private DoctorService doctorService

    @Autowired
    private DoctorRepository doctorRepository

    def setup() {
        //doctorService = new DoctorService()

        //doctorRepository = Stub(DoctorRepository.class)
        //doctorService.setDoctorRepository(doctorRepository)
        doctorService = new DoctorService(doctorRepository)
    }


    def "Find by Name"() {
        given: "a docktor with examples value"
        Doctor doctor = new Doctor()
        doctor.setId(1L)
        doctor.setName("Radek")
        doctor.setSurname("Janiak")

        /*and: "always return doctor"
        doctorRepository.findAllByName("Radek") >> doctor
        log.info(doctor.toString())*/

        when: "we ask for a docktor"
        Doctor octor = doctorService.findByName("Radek")
        print(octor)

        then: "we got docktor, can check surname"
        print(octor)
        octor.getSurname() == "Janiak"

    }
}
