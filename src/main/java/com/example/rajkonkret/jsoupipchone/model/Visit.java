package com.example.rajkonkret.jsoupipchone.model;


import com.example.rajkonkret.jsoupipchone.StatusYourVisit;
import com.example.rajkonkret.jsoupipchone.TypeOfVisit;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Data

@Entity

@NoArgsConstructor
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user2_id")
    User2 user;

    LocalDate dateOfVisit;

    @Enumerated(EnumType.STRING)
    StatusYourVisit status;

    @Enumerated(EnumType.STRING)
    TypeOfVisit typeOfVisit;

    //    @ManyToOne
//    @JoinColumn(name = "user_id")


//    @ManyToOne
//    @JoinColumn(name = "doctor_id")
//    Doctor doctor;


}
