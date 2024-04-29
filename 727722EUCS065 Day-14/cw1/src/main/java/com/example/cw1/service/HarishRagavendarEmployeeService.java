package com.example.cw1.service;

import com.example.cw1.model.HarishRagavendarEmployee;
import com.example.cw1.repository.HarishRagavendarEmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HarishRagavendarEmployeeService {
    private final HarishRagavendarEmployeeRepo employeeRepo;

    public HarishRagavendarEmployeeService(HarishRagavendarEmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public HarishRagavendarEmployee createEmployee(HarishRagavendarEmployee employee) {
        return employeeRepo.save(employee);
    }

    public List<HarishRagavendarEmployee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Optional<HarishRagavendarEmployee> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }
}
