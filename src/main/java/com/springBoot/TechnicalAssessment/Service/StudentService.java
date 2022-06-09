package com.springBoot.TechnicalAssessment.Service;

import com.springBoot.TechnicalAssessment.Entity.Faculty;
import com.springBoot.TechnicalAssessment.Entity.Student;
import com.springBoot.TechnicalAssessment.Repository.FacultyRepository;
import com.springBoot.TechnicalAssessment.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

class NameComparator implements Comparator<Student>
{
    public int compare(Student student1, Student student2)
    {
        return student1.getStudent_name().compareTo(student2.getStudent_name());
    }
}
@Service
public class StudentService {
    @Autowired
    FacultyRepository facultyRepository;
    @Autowired
    StudentRepository studentRepository;

    public Object RetrieveStudent(int StudentId){
      return  studentRepository.findById(StudentId);
    }


    //add new student
    public void AddStudent(){
        Faculty faculty = facultyRepository.getReferenceById(1);
        Student student = Student.builder()
                        .student_name("Ahmed")
                        .student_level(2)
                         .top_ten(1)
                         .faculty(faculty)
                         .build();
        studentRepository.save(student);
    }


   //4


    // get students by faculty id
    public List<Student> getFacultyStudents(int facultyId){

        return studentRepository.getAllByFacultyId(facultyId);
    }



/// 5 sort students by name
    public Set<Student> sort (Set<Student> students) {

        Set<Student> Unordered_Students = new HashSet<>();
        for(Student stud : students) {
            Unordered_Students.add(stud);

        }

        TreeSet ordered_students = new TreeSet<>(new NameComparator());
        for(Student studs : Unordered_Students) {
            ordered_students.add(studs);
        }
        return ordered_students;

    }








}
