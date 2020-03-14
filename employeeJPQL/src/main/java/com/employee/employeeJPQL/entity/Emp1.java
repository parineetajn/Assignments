package com.employee.employeeJPQL.entity;

import javax.persistence.*;

//Inheritance Mapping :Single_Table Strategy
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "emp1_type",discriminatorType = DiscriminatorType.STRING)
public class Emp1 {
    @Id
    private int id;
    private String name;
    private double salary;

    public Emp1() {
    }

    public Emp1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
