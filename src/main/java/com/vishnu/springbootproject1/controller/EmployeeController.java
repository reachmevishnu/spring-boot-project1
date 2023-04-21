package com.vishnu.springbootproject1.controller;

import com.vishnu.springbootproject1.model.Employee;
import com.vishnu.springbootproject1.service.EmployeeService;
import com.vishnu.springbootproject1.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping
    public Employee save(@RequestBody Employee employee)
    {

        return employeeService.save(employee);
    }
    @GetMapping
    public List<Employee> getEmployees()
    {

        return employeeService.getEmployees();
    }
    @GetMapping("/{id}")
    public Employee getEmployeeByID(@PathVariable String id)
    {

        return employeeService.getEmployeeById(id);
    }
}
