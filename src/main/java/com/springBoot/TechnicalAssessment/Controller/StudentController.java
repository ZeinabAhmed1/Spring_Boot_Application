package com.springBoot.TechnicalAssessment.Controller;

import com.springBoot.TechnicalAssessment.Entity.Student;
import com.springBoot.TechnicalAssessment.Repository.StudentRepository;
import com.springBoot.TechnicalAssessment.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping
public class StudentController {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    private StudentService studentService;


    @RequestMapping(value = "/{id}")
    public List<Student> display_student_service(@PathVariable int id) {

        List<Student> students =studentService.getFacultyStudents(id);

        return students;

    }


    @RequestMapping(value = "/SortStudents")
  public Set<Student> SortStudentsByName(){
        Set<Student> ConvertListToSet = new HashSet<>();
        List<Student> allStudents =studentRepository.findAll();
        ConvertListToSet.addAll(allStudents);
        Set<Student> allStudentsSet= studentService.sort(ConvertListToSet);

        return allStudentsSet;
  }

    /*@RequestMapping(value = "/Student/retrieve/studentid=?")
    public Student retrieveStudentService(){
        return studentService.RetrieveStudent()
    }*/

}