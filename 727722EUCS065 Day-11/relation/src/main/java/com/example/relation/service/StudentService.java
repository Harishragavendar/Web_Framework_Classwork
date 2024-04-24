package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.model.Student;
import com.example.relation.repository.HarishRagavendarStudentRepository;

@Service
public class StudentService {
    public HarishRagavendarStudentRepository studentRepository;
    public StudentService(HarishRagavendarStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }
    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }
}
