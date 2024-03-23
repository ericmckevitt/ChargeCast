package com.example.chargecast.services;

import org.springframework.stereotype.Service;

@Service
public class SurchargeService {
    public String getGrade(String grade) {
        return  "Service says Grade: " + grade;
    }

    public String getAllGrades() {
        return "Service says here's all the grades";
    }
}
