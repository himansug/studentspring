package com.example.studentManagementPortal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


    @GetMapping("/get_info")
    public Student getStudent(@RequestParam("id") int adminNo) {

//    return studentDB.get(adminNo);
        return studentService.getStudent(adminNo);
    }


    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
//    studentDB.put(student.getAdminNo(),student);
        studentService.addStudent(student);
        return "Student added succesfully";
    }

    //@GetMapping("/get/{id}")
//public Student getStudentByPathvariable(@PathVariable("id") int adminNo){
//        Student student = studentDB.get(adminNo);
//        return student;
//}
    @GetMapping("/get/{id}/{message}")
    public String getStudentByPathvariable(@PathVariable("id") int adminNo, @PathVariable(value = "message") String message) {
//        String student = studentDB.get(adminNo)+"message";
//        return student;
        return studentService.getStudentByPathVariable(adminNo, message);
    }

//    @DeleteMapping("/delete")
//    public String deleteStudent(@RequestParam("id") int adminNo){
//        studentDB.remove(adminNo);
//        return "student deleted succesfully";
//    }
//
//    //update student db ///put
//    @PutMapping("/Update_course")
//    public Student updatecourse(@RequestParam("id") int adminNo,@RequestParam("course") String newCourse){
//        if(!studentDB.containsKey(adminNo)){
//            throw new RuntimeException("student doesnt exist");
//        }
//        Student student =studentDB.get(adminNo);
//        student.setCourse(newCourse);
//        return student;
//    }
//
//
//    //total student greater than 25
//    @GetMapping("/get_total")
//    public int getTotalStudent(){
//        int total=0;
//        for(int adminN0:studentDB.keySet()){
//            if(studentDB.get(adminN0).getAge()>=25){
//                total++;
//            }
//        }
//        return total;
//        }
}
