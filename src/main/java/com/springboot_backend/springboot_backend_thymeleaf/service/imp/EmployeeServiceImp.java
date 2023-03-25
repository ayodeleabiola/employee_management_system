package com.springboot_backend.springboot_backend_thymeleaf.service.imp;

import com.springboot_backend.springboot_backend_thymeleaf.model.Employee;
import com.springboot_backend.springboot_backend_thymeleaf.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EmployeeServiceImp {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImp(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployee(){
        return StreamSupport.stream(employeeRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
