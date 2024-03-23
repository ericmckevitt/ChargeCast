package com.example.chargecast.controllers;

import com.example.chargecast.services.SurchargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("surcharge")
public class SurchargeController {

    private final SurchargeService surchargeService;

    @Autowired
    public SurchargeController(SurchargeService surchargeService) {
        this.surchargeService = surchargeService;
    }

    @GetMapping("/{grade}")
    public String getGrade(@PathVariable String grade) {
        return surchargeService.getGrade(grade);
    }

    @GetMapping("/")
    public String getAllGrades(){return surchargeService.getAllGrades();}
}
