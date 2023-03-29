package com.springboot_backend.springboot_backend_thymeleaf.rest;

import com.springboot_backend.springboot_backend_thymeleaf.model.Employee;
import com.springboot_backend.springboot_backend_thymeleaf.service.imp.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/rest",produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeRestController {

    /**
     This is a rest controller which u can access from Postman to add an employee
     */

    @Autowired
    private final EmployeeServiceImp employeeServiceImp;

    public EmployeeRestController(EmployeeServiceImp employeeServiceImp) {
        this.employeeServiceImp = employeeServiceImp;
    }

    @PostMapping()
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeServiceImp.addEmployee(employee);
    }

}
