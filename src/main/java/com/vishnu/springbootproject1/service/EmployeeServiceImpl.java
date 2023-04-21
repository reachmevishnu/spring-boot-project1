package com.vishnu.springbootproject1.service;

import com.vishnu.springbootproject1.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> employees=new ArrayList<>();

    @Override
    public Employee save(Employee employee) {
        if(employee.getEmpId()==null || employee.getEmpId().isEmpty())
            employee.setEmpId(UUID.randomUUID().toString());
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employees.stream().filter(employee -> employee.getEmpId().equalsIgnoreCase(id)).findFirst().get();
    }
}
