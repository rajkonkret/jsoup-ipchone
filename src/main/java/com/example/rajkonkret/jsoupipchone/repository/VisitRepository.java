package com.example.rajkonkret.jsoupipchone.repository;

import com.example.rajkonkret.jsoupipchone.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Long> {

    List<Visit> findAll();

    @Query(value = " select v from Visit v")
    Collection<Visit> findAllVisits();
}
