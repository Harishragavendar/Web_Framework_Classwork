package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.HarishRagavendarStudent;
import com.example.relation.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
    public class HarishRagavendarStudentController {
    public StudentService studentService;
    public HarishRagavendarStudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public HarishRagavendarStudent postMethodName(@RequestBody HarishRagavendarStudent student) {
        return HarishRagavendarstudentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<HarishRagavendarStudent> getMethodName() {
        return HarishRagavendarstudentService.getStudents();
    }
    
}
