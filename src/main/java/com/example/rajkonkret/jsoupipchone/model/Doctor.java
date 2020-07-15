package com.example.rajkonkret.jsoupipchone.model;

import com.example.rajkonkret.jsoupipchone.Specialty;
import com.example.rajkonkret.jsoupipchone.TypeOfVisit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String surname;
    @Enumerated(EnumType.STRING)
    Specialty specialty;
//    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
//    Set<Visit> visit = new HashSet<>();

    public Doctor(String name, String surname, Specialty specialty) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
    }

    public Doctor(String fra, String kjres, Specialty ogólny, Set<Visit> o) {
        this.name = fra;
        this.surname = kjres;
        this.specialty = ogólny;
       // this.visit = o;
    }
    // Specialty specialty;
}
