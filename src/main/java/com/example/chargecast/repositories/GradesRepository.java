package com.example.chargecast.repositories;

import com.example.chargecast.models.GradeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradesRepository extends JpaRepository<GradeModel, Integer> {
//    @Query("SELECT * FROM Grades")
//    List<GradeModel> findAllGrades();
}
