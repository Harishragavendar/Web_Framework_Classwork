package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.HarishRagavendarStudent;
import com.example.springapp.repository.HarishRagavendarStudentRepository;

@Service
public class HarishRagavendarStudentService {
    @Autowired
    HarishRagavendarStudentRepository studentRepository;
    public HarishRagavendarStudent addStudents(HarishRagavendarStudent student)
    {
        return studentRepository.save(student);
    }
    public List<HarishRagavendarStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<HarishRagavendarStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<HarishRagavendarStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
