package com.employee.employeeJPQL.entity;

import com.employee.employeeJPQL.Repos.Emp3Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Emp3Test {

    @Autowired
    Emp3Repository emp3Repository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testCreateEmployee() {

        List<Emp3> employeeList = new ArrayList<>();

        employeeList.add(new TraineeEmp3(1, "Parineeta", 23000, 10));
        employeeList.add(new RegularEmp3(2, "Pinki", 21000, "abc"));
        employeeList.add(new TraineeEmp3(3, "Shivam", 29000, 48));
        employeeList.add(new RegularEmp3(4, "Himanshu", 25000, "cde"));

        employeeList.forEach(e -> emp3Repository.save(e));
    }
}