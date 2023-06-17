package com.example.studentManagementPortal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public Student getStudent(int adminNo){
return studentRepository.getStudent(adminNo);
    }


    public String addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    public String getStudentByPathVariable(int adminNo, String message) {

        Student s = studentRepository.getStudentByPathVariable(adminNo);
        return s + message;
    }
}
