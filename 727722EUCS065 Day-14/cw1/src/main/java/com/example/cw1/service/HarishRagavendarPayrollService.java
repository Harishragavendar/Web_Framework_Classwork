package com.example.cw1.service;

import com.example.cw1.model.HarishRagavendarPayroll;
import com.example.cw1.repository.HarishRagavendarPayrollRepo;
import org.springframework.stereotype.Service;

@Service
public class HarishRagavendarPayrollService {
    private final HarishRagavendarPayrollRepo payrollRepo;

    public HarishRagavendarPayrollService(HarishRagavendarPayrollRepo payrollRepo) {
        this.payrollRepo = payrollRepo;
    }

    public HarishRagavendarPayroll createPayroll(HarishRagavendarPayroll payroll) {
        return payrollRepo.save(payroll);
    }

    public HarishRagavendarPayroll getPayrollByEmployeeId(Long employeeId) {
        return payrollRepo.findById(employeeId).orElse(null);
    }
}
