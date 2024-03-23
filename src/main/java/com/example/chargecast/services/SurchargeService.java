package com.example.chargecast.services;

import org.springframework.stereotype.Service;

@Service
public class SurchargeService {
    public String getSurcharge(String grade) {
        return  "Service says Grade: " + grade;
    }

    public String getAllSurcharges() {
        return "Service says here's all the grades";
    }
}
