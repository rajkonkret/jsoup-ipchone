package com.example.rajkonkret.jsoupipchone.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data

@Entity

@NoArgsConstructor

public class User2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    String surname;
    String pesel;
    String username;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,fetch  = FetchType.EAGER)
    Set<Visit> visits = new HashSet<>();

    public void addVisit(Visit visit) {
        visit.setUser(this);
        visits.add(visit);

    }


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


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    @JsonIgnore
    public Set<Visit> getVisits() {
        return visits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User2 user2 = (User2) o;
        return Objects.equals(username, user2.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
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

