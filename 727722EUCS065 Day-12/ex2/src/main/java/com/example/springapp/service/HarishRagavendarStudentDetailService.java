package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.HarishRagavendarStudentDetail;
import com.example.springapp.repository.HarishRagavendarStudentDetailRepository;
import com.example.springapp.repository.HarishRagavendarStudentRepository;

@Service
public class HarishRagavendarStudentDetailService {
    @Autowired
    HarishRagavendarStudentDetailRepository studentDetailRepository;
    @Autowired
    HarishRagavendarStudentRepository studentRepository;
    public HarishRagavendarStudentDetail addStudentDetail(int id,HarishRagavendarStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
