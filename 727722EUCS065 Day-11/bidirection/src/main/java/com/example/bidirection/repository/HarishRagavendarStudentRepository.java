package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.HarishRagavendarStudent;



@Repository
public interface HarishRagavendarStudentRepository extends JpaRepository<HarishRagavendarStudent,Integer>{
    
}
