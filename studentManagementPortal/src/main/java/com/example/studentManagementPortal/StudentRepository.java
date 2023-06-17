package com.example.studentManagementPortal;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentRepository {

    Map<Integer,Student> studentDB=new HashMap<>() ;

    public Student getStudent(int adminNo){
        return studentDB.get(adminNo);
    }

    public String addStudent(Student student) {
        if(!studentDB.containsKey(student.getAdminNo())){
            return "student already present";
        }
        studentDB.put(student.getAdminNo(),student);
        return "Student added succesfully";
    }
    public Student getStudentByPathVariable(int admnNo) {

        return studentDB.get(admnNo);
    }
}
