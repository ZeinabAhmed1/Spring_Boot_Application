package com.springBoot.TechnicalAssessment.Repository;

import com.springBoot.TechnicalAssessment.Entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, Integer> {


}
