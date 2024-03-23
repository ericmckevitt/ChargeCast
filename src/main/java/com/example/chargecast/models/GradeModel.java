package com.example.chargecast.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Grades")
public class GradeModel {
    private @Id @GeneratedValue Integer id;
    private String grade;
    private float nickel;
    private float chrome;
    private float molybdenum;
    private float iron;
    private float titanium;
    private float manganese;
    private float copper;
    private float rubidium;
    private float silicon;
    private float energy;

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    public Integer getId() {
        return id;
    }
}
