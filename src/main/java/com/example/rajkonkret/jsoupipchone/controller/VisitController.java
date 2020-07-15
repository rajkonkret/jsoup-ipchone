package com.example.rajkonkret.jsoupipchone.controller;

import com.example.rajkonkret.jsoupipchone.model.Visit;
import com.example.rajkonkret.jsoupipchone.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/visits")
public class VisitController {
    @Autowired
    VisitRepository visitRepository;

    @GetMapping
    public List<Visit> getAllVisits() {
        return visitRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Visit createVisit(@RequestBody Visit visit) {
        System.out.println(visit.getDateOfVisit());
        System.out.println(ZonedDateTime.now());
        return visitRepository.save(visit);

    }
}
