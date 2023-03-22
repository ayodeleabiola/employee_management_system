package com.springboot_backend.springboot_backend_thymeleaf.repository;

import com.springboot_backend.springboot_backend_thymeleaf.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface Employee_Repository  extends JpaRepository<Employee,Long> {
}
