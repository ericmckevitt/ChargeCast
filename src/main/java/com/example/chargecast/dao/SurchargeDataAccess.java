package com.example.chargecast.dao;

import com.example.chargecast.models.GradeModel;
import com.example.chargecast.repositories.GradesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SurchargeDataAccess {

    private final GradesRepository gradesRepository;

    public SurchargeDataAccess(GradesRepository gradesRepository) {
        this.gradesRepository = gradesRepository;
    }

    public List<GradeModel> findAllGrades() {
//        return gradesRepository.findAll();
        GradeModel gradeModel = new GradeModel();
        return List.of(gradeModel);
    }
}
