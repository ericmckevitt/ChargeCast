package com.example.chargecast.services;

import org.springframework.stereotype.Service;

@Service
public class SurchargeService {
    public String sayGrade(String grade) {
        return  "Service says Grade: " + grade;
    }
}
