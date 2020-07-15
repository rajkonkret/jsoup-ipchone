package com.example.rajkonkret.jsoupipchone.repository;


import com.example.rajkonkret.jsoupipchone.model.User2;
import com.example.rajkonkret.jsoupipchone.model.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;


@Repository
public
interface UserRepository extends JpaRepository<User2, Long> {
    //@Query(value = "SELECT t.name  FROM USER t;", nativeQuery = true)

    //@Query(value = "SELECT t.name  FROM user2 t;", nativeQuery = true)
    List<User2> findAll();

    @Query(value = "select  new com.example.rajkonkret.jsoupipchone.model.UserDto(u.name as name, u.surname as surname) from User2 u")
   // List<UserDto> findAllUserDto();
   // Collection<User2> findAllUser();
    Collection<UserDto> findAllUserDto();
}
