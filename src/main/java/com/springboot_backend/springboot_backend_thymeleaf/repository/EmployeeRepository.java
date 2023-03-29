package com.springboot_backend.springboot_backend_thymeleaf.repository;

import com.springboot_backend.springboot_backend_thymeleaf.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee,Long> {
    /**
        extend CrudRepository when u need to save, update, delete and look for data
        be careful with the limitations of extending JpaRepository!!!
    */

}
