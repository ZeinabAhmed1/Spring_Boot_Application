package com.springBoot.TechnicalAssessment.Repository;

import com.springBoot.TechnicalAssessment.Entity.Student_Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface StudentMaterialRepository extends JpaRepository<Student_Material, Integer> {

    @Query(
            value = "SELECT student_id , sum(grade) from technicalassessment_database.student_material group by student_id order by sum(grade)desc ",
            nativeQuery = true
    )

     Set< Student_Material > getEachStudentSumOfGradesAndOrderDes ();




}
