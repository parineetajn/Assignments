package com.employee.employeeJPQL.entity;

import com.employee.employeeJPQL.Repos.Emp1Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Emp1Test {
    @Autowired
    Emp1Repository emp1Repository;

    @Test
    void contextLoads() {
    }
    @Test
    public void testCreateEmployee() {

        List<Emp1> employeeList = new ArrayList<>();

        employeeList.add(new TraineeEmp1(1, "Parineeta", 23000, 10));
        employeeList.add(new RegularEmp1(2, "Pinki", 21000, "abc"));
        employeeList.add(new TraineeEmp1(3,"Shivam", 29000, 48));
        employeeList.add(new RegularEmp1(4, "Himanshu", 25000, "cde"));

        employeeList.forEach(e -> emp1Repository.save(e));
    }

}