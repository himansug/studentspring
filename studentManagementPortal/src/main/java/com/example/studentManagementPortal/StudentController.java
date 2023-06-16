package com.example.studentManagementPortal;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    Map<Integer,Student> studentDB=new HashMap<>() ;

    @GetMapping("/get_info")
public Student getStudent(@RequestParam("id") int adminNo){
    return studentDB.get(adminNo);
}
@PostMapping("/add")
public String addStudent(@RequestBody Student student){
    studentDB.put(student.getAdminNo(),student);
    return "Student added succesfully";
}

@GetMapping("/get/{id}")
public Student getStudentByPathvariable(@PathVariable("id") int adminNo){
        Student student = studentDB.get(adminNo);
        return student;
}
    @GetMapping("/get/{id}/{message}")
    public String getStudentByPathvariable(@PathVariable("id") int adminNo,@PathVariable(value="message") String message){
        String student = studentDB.get(adminNo)+"message";
        return student;
    }
}
