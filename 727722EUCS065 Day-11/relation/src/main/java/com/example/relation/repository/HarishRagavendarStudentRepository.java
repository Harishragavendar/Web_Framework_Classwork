package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.Student;

@Repository
public interface HarishRagavendarStudentRepository extends JpaRepository<Student,Integer>{
    
}
