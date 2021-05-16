package com.example.managementappfinal.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String jobPosition;
    private String email;
    private String phone;
    private String town;

    public Employee(Long id, String firstName, String lastName, String jobPosition, String email, String phone, String town) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobPosition = jobPosition;
        this.email = email;
        this.phone = phone;
        this.town = town;
    }

    public Employee() {

    }

    public Long getId() {
        return id;
    }

    public Employee setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public Employee setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Employee setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Employee setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getTown() {
        return town;
    }

    public Employee setTown(String town) {
        this.town = town;
        return this;
    }
}
