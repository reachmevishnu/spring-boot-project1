package com.vishnu.springbootproject1.service;

import com.vishnu.springbootproject1.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee save(Employee employee);

    public List<Employee> getEmployees();

    public Employee getEmployeeById(String id);
}
