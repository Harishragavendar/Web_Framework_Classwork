package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.HarishRagavendarStudent;
import com.example.bidirection.model.HarishRagavendarStudentInfo;
import com.example.bidirection.repository.HarishRagavendarStudentInfoRepository;
import com.example.bidirection.repository.StudentRepository;

@Service
public class HarishRagavendarStudentService {
    public StudentRepository studentRepository;
    public HarishRagavendarStudentInfoRepository studentInfoRepository;
    public HarishRagavendarStudentService(StudentRepository studentRepository,HarishRagavendarStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public HarishRagavendarStudent saveStudent(HarishRagavendarStudent student)
    {
        return studentRepository.save(student);
    }
    public HarishRagavendarStudentInfo saveStudentInfo(HarishRagavendarStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<HarishRagavendarStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
