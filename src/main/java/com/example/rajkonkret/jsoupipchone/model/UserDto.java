package com.example.rajkonkret.jsoupipchone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.SqlResultSetMapping;
import java.util.Objects;


@Data
@NoArgsConstructor
//@RequiredArgsConstructor
public class UserDto {
    String name;
    String surname;

    public UserDto(String name, String surname) {

        this.name = name;
        this.surname = surname;
    }


}