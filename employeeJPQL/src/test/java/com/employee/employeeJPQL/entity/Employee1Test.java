package com.employee.employeeJPQL.entity;

import com.employee.employeeJPQL.Repos.Employee1Repository;
import com.employee.employeeJPQL.Salary;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Employee1Test {

    @Autowired
    Employee1Repository employee1Repository;
    @Test
    public void create() {
        List<Employee1> employeeList = new ArrayList<>();

        employeeList.add(new Employee1(1, "Parineeta", "Jain", new Salary(10000d, 100d, 350d, 500d)));
        employeeList.add(new Employee1(2, "Pinki", "Bhati",new Salary(12000d,400d,750d,800d)));

        employeeList.forEach(e -> employee1Repository.save(e));

    }
}