package com.springboot_backend.springboot_backend_thymeleaf.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

/**
 Look into the Lombok Library/Dependency and start using it!
 */

@Entity
@Table(name="Employee")
public class Employee {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(name= "firstname")
    // TODO: use camel case for attribute naming -> "firstName"
    private String firstname;
    @Column(name= "lastname")
    private String lastname;
    @Column(name= "email")
    private String email;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yyyy")
    @Column(name= "dob")
    private  String dob;


    public Employee() {
    }

    public Employee(String firstname, String lastname, String email, String dob) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.dob = dob;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getDob() {
        return dob;
    }
}
