package com.example.chargecast.services;

import com.example.chargecast.dao.SurchargeDataAccess;
import com.example.chargecast.models.GradeModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurchargeService {

    private final SurchargeDataAccess surchargeDataAccess;

    public SurchargeService(SurchargeDataAccess surchargeDataAccess) {
        this.surchargeDataAccess = surchargeDataAccess;
    }

    public String getSurcharge(String grade) {
        return  "Service says Grade: " + grade;
    }

    public String getAllSurcharges() {
        List<GradeModel> grades = surchargeDataAccess.findAllGrades();
        return grades.toString();
    }
}
