package com.springBoot.TechnicalAssessment.Repository;

import com.springBoot.TechnicalAssessment.Entity.Faculty;
import com.springBoot.TechnicalAssessment.Entity.University;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class FacultyRepositoryTest {
    @Autowired
    private FacultyRepository facultyRepository;

    @Test
    public void saveFaculty(){
        University university = University.builder()
                .university_id(3)
                .university_name("Cairo")
                .build();
        Faculty faculty =  Faculty.builder()
                .faculty_name("Computer Science")
               .university(university)
                .build();

        facultyRepository.save(faculty);
    }

}