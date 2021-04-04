package com.example.rajkonkret.jsoupipchone.service;

import com.example.rajkonkret.jsoupipchone.model.Doctor;
import com.example.rajkonkret.jsoupipchone.repository.DoctorRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@Service
public class DoctorService {

    DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Doctor findByName(String name) {
        return doctorRepository.findAllByName(name);
    }
}
