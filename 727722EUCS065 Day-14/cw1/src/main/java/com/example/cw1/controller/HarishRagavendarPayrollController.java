package com.example.cw1.controller;

import com.example.cw1.model.HarishRagavendarPayroll;
import com.example.cw1.service.HarishRagavendarPayrollService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee/{employeeId}/payroll")
public class HarishRagavendarPayrollController {
    private final HarishRagavendarPayrollService payrollService;

    public HarishRagavendarPayrollController(HarishRagavendarPayrollService payrollService) {
        this.payrollService = payrollService;
    }

    @PostMapping
    public ResponseEntity<HarishRagavendarPayroll> createPayrollForEmployee(@PathVariable Long employeeId, @RequestBody HarishRagavendarPayroll payroll) {
        HarishRagavendarPayroll createdPayroll = payrollService.createPayroll(payroll);
        if (createdPayroll != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdPayroll);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping
    public ResponseEntity<HarishRagavendarPayroll> getPayrollForEmployee(@PathVariable Long employeeId) {
        HarishRagavendarPayroll payroll = payrollService.getPayrollByEmployeeId(employeeId);
        if (payroll != null) {
            return ResponseEntity.ok(payroll);
        } else {
            return ResponseEntity.status(404).build();
        }
    }
}
