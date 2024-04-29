package com.example.cw1.controller;

import com.example.cw1.model.HarishRagavendarEmployee;
import com.example.cw1.service.HarishRagavendarEmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class HarishRagavendarEmployeeController {
    private final HarishRagavendarEmployeeService employeeService;

    public HarishRagavendarEmployeeController(HarishRagavendarEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<HarishRagavendarEmployee> createEmployee(@RequestBody HarishRagavendarEmployee employee) {
        HarishRagavendarEmployee createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
    }

    @GetMapping
    public ResponseEntity<List<HarishRagavendarEmployee>> getAllEmployees() {
        List<HarishRagavendarEmployee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<HarishRagavendarEmployee> getEmployeeById(@PathVariable Long employeeId) {
        Optional<HarishRagavendarEmployee> employee = employeeService.getEmployeeById(employeeId);
        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

