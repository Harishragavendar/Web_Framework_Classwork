package com.example.ce1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.model.HarishRagavendarEmployee;
import com.example.ce1.service.HarishRagavendarEmployeeService;

@RestController
public class HarishRagavendarEmployeeController {
    @Autowired
    HarishRagavendarEmployeeService employeeService;

    @PostMapping("/employee")
    public HarishRagavendarEmployee setMethod(@RequestBody HarishRagavendarEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<HarishRagavendarEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<HarishRagavendarEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
