package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.HarishRagavendarStudentInfo;

@Repository
public interface HarishRagavendarStudentInfoRepository extends JpaRepository<HarishRagavendarStudentInfo,Integer>{
    
}