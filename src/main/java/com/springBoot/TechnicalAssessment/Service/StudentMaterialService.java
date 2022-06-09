package com.springBoot.TechnicalAssessment.Service;

import com.springBoot.TechnicalAssessment.Entity.Student;
import com.springBoot.TechnicalAssessment.Entity.Student_Material;
import com.springBoot.TechnicalAssessment.Repository.StudentMaterialRepository;
import com.springBoot.TechnicalAssessment.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class StudentMaterialService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    StudentMaterialRepository studentMaterialRepository;

    public Set<Student_Material> Sort_Student_Material_Set (){
        return studentMaterialRepository.getEachStudentSumOfGradesAndOrderDes();
    }


    // retrieve the second highest student of total grades
    Student_Material findSecondHighest (Set<Student_Material> studentMaterials){
        List<Student_Material> StudentMaterials = new ArrayList<>();
        StudentMaterials.addAll(studentMaterials);
        return StudentMaterials.get(1);
    }

}
