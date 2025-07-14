package com.example.employeeapi.controller;

import com.example.employeeapi.model.Employee;
import com.example.employeeapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repo;

    // Save employee
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute Employee employee) {
        repo.save(employee);
        return "Employee saved successfully!";
    }

    // Display all employees
    @GetMapping("/displayall")
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    // Display one employee by ID
    @GetMapping("/display/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        return repo.findById(id).orElse(null);
    }
}
