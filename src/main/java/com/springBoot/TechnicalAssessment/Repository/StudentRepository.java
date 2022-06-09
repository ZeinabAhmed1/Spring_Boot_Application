package com.springBoot.TechnicalAssessment.Repository;

import com.springBoot.TechnicalAssessment.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface StudentRepository extends JpaRepository<Student, Integer> {

     @Query(
             value="SELECT * FROM student  where faculty_id =:facultyId",
             nativeQuery = true
     )
      List<Student> getAllByFacultyId(int facultyId);


   //  public List<Student> getFacultyStudents(int facultyId);


}
