package com.example.rajkonkret.jsoupipchone.service;

import com.example.rajkonkret.jsoupipchone.model.Visit;
import com.example.rajkonkret.jsoupipchone.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VisitService {

    @Autowired
    VisitRepository visitRepository;

    public Collection<Visit> getAllVisits(){
        return visitRepository.findAllVisits();
    }

}
