package com.springBoot.TechnicalAssessment.Repository;

import com.springBoot.TechnicalAssessment.Entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

}
