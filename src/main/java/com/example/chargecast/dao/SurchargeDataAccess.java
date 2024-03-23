package com.example.chargecast.dao;

import com.example.chargecast.repositories.GradesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SurchargeDataAccess {

    @Autowired
    private final GradesRepository gradesRepository;

    public SurchargeDataAccess(GradesRepository gradesRepository) {
        this.gradesRepository = gradesRepository;
    }
}
