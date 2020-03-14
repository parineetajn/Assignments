package com.employee.employeeJPQL.entity;

import com.employee.employeeJPQL.Salary;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

//Component Mapping
@Entity
public class Employee1 {
    @Id
    private int id;
    private String firstName;
    private String lastName;

    @Embedded
    Salary salary;

    public Employee1() {
    }

    public Employee1(int id, String firstName, String lastName, Salary salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}