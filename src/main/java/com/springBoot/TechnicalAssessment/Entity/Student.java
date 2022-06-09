package com.springBoot.TechnicalAssessment.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor

@Entity
@Builder
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    private int student_id;

    private String student_name;
    private int student_level;
    private int top_ten;

    @ManyToOne(
            cascade=CascadeType.ALL
    )
    @JoinColumn(
            name= "faculty_id",
            referencedColumnName = "faculty_id"
    )
    private Faculty faculty;


    @OneToMany(mappedBy = "student")
    Set<Student_Material> StudentMaterial;


    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getStudent_level() {
        return student_level;
    }

    public void setStudent_level(int student_level) {
        this.student_level = student_level;
    }

    public int getTop_ten() {
        return top_ten;
    }

    public void setTop_ten(int top_ten) {
        this.top_ten = top_ten;
    }
}
