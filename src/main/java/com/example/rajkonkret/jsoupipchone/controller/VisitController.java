package com.example.rajkonkret.jsoupipchone.controller;

import com.example.rajkonkret.jsoupipchone.model.Visit;
import com.example.rajkonkret.jsoupipchone.model.VisitDto;
import com.example.rajkonkret.jsoupipchone.repository.VisitRepository;
import com.example.rajkonkret.jsoupipchone.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.Collection;

@RestController
@CrossOrigin
@RequestMapping("/visits")
public class VisitController {
    @Autowired
    VisitRepository visitRepository;

    @Autowired
    VisitService visitService;

    @GetMapping
    public Collection<VisitDto> getAllVisits() {
        return visitService.getAllVisits();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Visit createVisit(@RequestBody Visit visit) {
        System.out.println(visit.getDateOfVisit());
        System.out.println(ZonedDateTime.now());
        return visitRepository.save(visit);

    }
}
