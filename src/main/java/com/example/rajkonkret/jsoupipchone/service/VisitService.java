package com.example.rajkonkret.jsoupipchone.service;

import com.example.rajkonkret.jsoupipchone.model.Visit;
import com.example.rajkonkret.jsoupipchone.model.VisitDto;
import com.example.rajkonkret.jsoupipchone.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class VisitService {

    @Autowired
    VisitRepository visitRepository;

    public Collection<VisitDto> getAllVisits(){
        Collection<VisitDto> visits = visitRepository.findAllVisitsDto();
        return visits.stream()
                .map( v -> new VisitDto(v.getTypeOfVisit(), v.getStatusYourVisit(), v.getDateOfVisit(), v.getUser2()))
                .collect(Collectors.toList());

        //return visitRepository.findAllVisitsDto();
    }

}
