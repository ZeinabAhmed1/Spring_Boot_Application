package com.springBoot.TechnicalAssessment.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student_Material {
    @Id
    @SequenceGenerator(
            name = "studentMaterial_sequence",
            sequenceName = "studentMaterial_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "studentMaterial_sequence"
    )
    private int studentMaterialId;



    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "material_id")
    private Material material;


    //I added CHECK constraint to check if the grade < 0
    private double grade;
    private int year;

    public int getStudentMaterialId() {
        return studentMaterialId;
    }

    public void setStudentMaterialId(int studentMaterialId) {
        this.studentMaterialId = studentMaterialId;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
