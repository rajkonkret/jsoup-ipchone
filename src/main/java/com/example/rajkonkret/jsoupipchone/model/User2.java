package com.example.rajkonkret.jsoupipchone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class User2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;
    String surname;
    String pesel;

    @OneToOne
    Visit visit;


//    public User2(String user, String surname) {
//        this.name = user;
//        this.surname = surname;
//    }


//    public User2(String name, String surname, String pesel, Visit visit) {
//        this.name = name;
//        this.surname = surname;
//        this.pesel = pesel;
//        this.visit = visit;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User2 user = (User2) o;
//        return Objects.equals(id, user.id) &&
//                Objects.equals(name, user.name) &&
//                Objects.equals(surname, user.surname) &&
//                Objects.equals(pesel, user.pesel) ;
//               // Objects.equals(visit, user.visit);
}

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, surname, pesel, visit);
//    }

