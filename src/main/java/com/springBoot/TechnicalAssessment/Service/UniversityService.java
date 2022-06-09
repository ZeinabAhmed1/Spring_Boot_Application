package com.springBoot.TechnicalAssessment.Service;

import com.springBoot.TechnicalAssessment.Entity.University;
import com.springBoot.TechnicalAssessment.Repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {
    @Autowired
      UniversityRepository universityRepository;

     public void AddUniversity(University university){

        universityRepository.save(university);
    }
}
