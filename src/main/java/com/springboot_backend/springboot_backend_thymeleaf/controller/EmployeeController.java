package com.springboot_backend.springboot_backend_thymeleaf.controller;

import com.springboot_backend.springboot_backend_thymeleaf.model.Employee;
import com.springboot_backend.springboot_backend_thymeleaf.service.imp.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("api/employee")
public class EmployeeController {
    /**
     STOP naming your classes Employee_Controller -> NO UNDERSCORES IN JAVA!!!
     */

    @Autowired
    private final EmployeeServiceImp employeeServiceImp;

    public EmployeeController(EmployeeServiceImp employeeServiceImp){
        this.employeeServiceImp = employeeServiceImp;
    }

    //display list of employee
    @GetMapping()
    public ModelAndView homeViewPage() {
        List<Employee> employees = employeeServiceImp.getAllEmployee();
        ModelAndView modelAndView = new ModelAndView("employees.html");
        modelAndView.addObject("employee", new Employee());
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }
}
