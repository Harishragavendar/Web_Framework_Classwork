package com.example.ce1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.HarishRagavendarEmployee;
import com.example.ce1.repository.HarishRagavendarEmployeeRepo;

@Service
public class HarishRagavendarEmployeeService {
    @Autowired
    HarishRagavendarEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public HarishRagavendarEmployee setEmployee(HarishRagavendarEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<HarishRagavendarEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<HarishRagavendarEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
