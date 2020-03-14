package com.employee.employeeJPQL.entity;

import com.employee.employeeJPQL.Repos.Emp2Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Emp2Test {

    @Autowired
    Emp2Repository emp2Repository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testCreateEmployee() {

        List<Emp2> employeeList = new ArrayList<>();

        employeeList.add(new TraineeEmp2(1, "Parineeta", 23000, 10));
        employeeList.add(new RegularEmp2(2, "Pinki", 21000, "abc"));
        employeeList.add(new TraineeEmp2(3,"Shivam", 29000, 48));
        employeeList.add(new RegularEmp2(4, "Himanshu", 25000, "cde"));

        employeeList.forEach(e -> emp2Repository.save(e));
    }

}