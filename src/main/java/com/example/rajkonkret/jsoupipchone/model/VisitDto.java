package com.example.rajkonkret.jsoupipchone.model;

import com.example.rajkonkret.jsoupipchone.StatusYourVisit;
import com.example.rajkonkret.jsoupipchone.TypeOfVisit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class VisitDto {
    TypeOfVisit typeOfVisit;
    StatusYourVisit statusYourVisit;
    LocalDate dateOfVisit;

    public VisitDto(TypeOfVisit typeOfVisit, StatusYourVisit statusYourVisit, LocalDate dateOfVisit) {
        this.typeOfVisit = typeOfVisit;
        this.statusYourVisit = statusYourVisit;
        this.dateOfVisit = dateOfVisit;
    }
}
