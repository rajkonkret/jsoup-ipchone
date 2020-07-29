package com.example.rajkonkret.jsoupipchone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.SqlResultSetMapping;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;


@Data
@NoArgsConstructor
//@RequiredArgsConstructor
public class UserDto {
    String name;
    String surname;
    String pesel;
    Set<Visit> visits = new HashSet<>();
    public UserDto(String name, String surname, String pesel, Set<Visit> visits ){

        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
         this.visits = visits;

    }


}