package com.springBoot.TechnicalAssessment.Repository;

import com.springBoot.TechnicalAssessment.Entity.Faculty;
import com.springBoot.TechnicalAssessment.Entity.Student;
import com.springBoot.TechnicalAssessment.Entity.University;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {
  @Autowired
    private StudentRepository studentRepository;

  @Test
  public void saveStudent() {
    University university = University.builder()
            .university_id(3)
            .university_name("Cairo")
            .build();
    Faculty faculty = Faculty.builder()
            .faculty_name("Sciences")
            .university(university)
            .build();

    Student student = Student.builder()
            .student_name("Ahmed")
            .student_level(4)
            .top_ten(0)
            .faculty(faculty)
            .build();
    studentRepository.save(student);
  }
 /*@Test
  public void getFacultyStudents(){
    List<String> stu = studentRepository.getAllByFacultyId(6);

    System.out.println(stu);
// convert the return type to string to check the output
  }*/
}