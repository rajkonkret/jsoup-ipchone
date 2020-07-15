package com.example.rajkonkret.jsoupipchone.model;


import com.example.rajkonkret.jsoupipchone.StatusYourVisit;
import com.example.rajkonkret.jsoupipchone.TypeOfVisit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    LocalDate dateOfVisit;
    @Enumerated(EnumType.STRING)
    StatusYourVisit status;
    @Enumerated(EnumType.STRING)
    TypeOfVisit typeOfVisit;

    //    @ManyToOne
//    @JoinColumn(name = "user_id")
    @OneToOne
    @JoinColumn(name = "user_id")
    User2 user;


//    @ManyToOne
//    @JoinColumn(name = "doctor_id")
//    Doctor doctor;



}
