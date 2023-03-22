package com.springboot_backend.springboot_backend_thymeleaf.service.imp;

import com.springboot_backend.springboot_backend_thymeleaf.model.Employee;
import com.springboot_backend.springboot_backend_thymeleaf.repository.Employee_Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImp {

    private Employee_Repository employeeRepository;
    public EmployeeServiceImp(Employee_Repository employeeRepository){
        this.employeeRepository=employeeRepository;

    }

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
}
