package com.example.rajkonkret.jsoupipchone.service

import com.example.rajkonkret.jsoupipchone.model.Doctor
import com.example.rajkonkret.jsoupipchone.repository.DoctorRepository
import spock.lang.Specification

import javax.persistence.EntityManager

class DoctorServiceTest extends Specification {

    private DoctorService doctorService

    private DoctorRepository doctorRepository

    public void setup() {
        doctorService = new DoctorService()

        doctorRepository = Stub(DoctorRepository.class)
        doctorService.setDoctorRepository(doctorRepository)
    }


    public void "Find by Name"(){
        given: "a docktor with examples value"
        Doctor doctor = new Doctor()
        doctor.setId(1L)
        doctor.setName("Radek")
        doctor.setSurname("Janiak")

        and: "always return doctor"
        doctorRepository.findAllByName("Radek") >> doctor
        print(doctor)

        when: "we ask for a docktor"
        Doctor octor = doctorService.findByName("Radek")
        print(octor)

        then: "we got docktor, can check surname"
        print(octor)
        octor.getSurname() == "Janiak"

    }
}
