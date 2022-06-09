package com.springBoot.TechnicalAssessment.Repository;

import com.springBoot.TechnicalAssessment.Entity.Faculty;
import com.springBoot.TechnicalAssessment.Entity.Material;
import com.springBoot.TechnicalAssessment.Entity.University;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MaterialRepositoryTest {

    @Autowired
    MaterialRepository materialRepository;

    @Test
    public void saveMaterial(){
        University university = University.builder()
                .university_id(6)
                .university_name("Assiut")
                .build();
        Faculty faculty = Faculty.builder()
                .faculty_name("Sciences")
                .university(university)
                .build();

        Material material = Material.builder()
                .material_name("Biology")
                .faculty(faculty)
                .build();
        materialRepository.save(material);
    }

}