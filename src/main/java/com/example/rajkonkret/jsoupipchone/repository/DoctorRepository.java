package com.example.rajkonkret.jsoupipchone.repository;

import com.example.rajkonkret.jsoupipchone.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    Doctor findAllByName(String name);
}
