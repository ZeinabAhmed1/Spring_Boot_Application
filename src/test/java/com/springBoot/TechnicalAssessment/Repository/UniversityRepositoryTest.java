package com.springBoot.TechnicalAssessment.Repository;

import com.springBoot.TechnicalAssessment.Entity.University;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UniversityRepositoryTest {
    @Autowired
 private UniversityRepository universityRepository;

    @Test
    public void saveUniversity(){


        /*         universityRepository.saveAll(List.of(

                                  University.builder()
                                 .university_name("AinShams")
                                 .build(),

                                  University.builder()
                                 .university_name("Cairo")
                                 .build(),

                                  University.builder()
                                 .university_name("Alexandria")
                                 .build(),

                                 University.builder()
                                 .university_name("Mansoura")
                                 .build(),

                                 University.builder()
                                 .university_name("Assiut")
                                 .build())); */
    }
}