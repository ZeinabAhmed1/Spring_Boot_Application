package com.springBoot.TechnicalAssessment.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class University {


    @Id
    @SequenceGenerator(
            name="university_sequence",
            sequenceName = "university_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "university_sequence"
    )

    private int university_id;
    private String university_name;


    public University(String university_name) {
        this.university_name = university_name;
    }

    public int getUniversity_id() {
        return university_id;
    }

    public void setUniversity_id(int university_id) {
        this.university_id = university_id;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }
}
