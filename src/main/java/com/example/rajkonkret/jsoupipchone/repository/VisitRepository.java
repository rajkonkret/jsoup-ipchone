package com.example.rajkonkret.jsoupipchone.repository;

import com.example.rajkonkret.jsoupipchone.model.Visit;
import com.example.rajkonkret.jsoupipchone.model.VisitDto;
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

//    @Query(value = "select new com.example.rajkonkret.jsoupipchone.model.VisitDto(v.typeOfVisit as typeOfVisit, v.status as statusYourVisit, v.dateOfVisit as dateOfVisit, v.user2 as user2 ) from Visit v ")
//    Collection<VisitDto> findAllVisitsDto();

    @Query(value = "select new com.example.rajkonkret.jsoupipchone.model.VisitDto(v.typeOfVisit as typeOfVisit, v.status as statusYourVisit, v.dateOfVisit as dateOfVisit, v.user as user2 ) from Visit v ")
    Collection<VisitDto> findAllVisitsDto();


}
