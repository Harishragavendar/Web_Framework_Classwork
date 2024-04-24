package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.HarishRagavendarStudent;
import com.example.bidirection.model.HarishRagavendarStudentInfo;
import com.example.bidirection.service.HarishRagavendarStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HarishRagavendarStudentController {
    public HarishRagavendarStudentService studentService;
    public HarishRagavendarStudentController(HarishRagavendarStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public HarishRagavendarStudent postMethodName(@RequestBody HarishRagavendarStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public HarishRagavendarStudentInfo postMethodName(@RequestBody HarishRagavendarStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<HarishRagavendarStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}