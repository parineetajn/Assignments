package com.employee.employeeJPQL;

import com.employee.employeeJPQL.Repos.EmployeeRepository;
import com.employee.employeeJPQL.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class EmployeeJpqlApplicationTests {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testCreateEmployee() {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Parineeta", "Jain", 23000, 23));
        employeeList.add(new Employee(2, "Pinki", "Bhati", 21000, 24));
        employeeList.add(new Employee(3, "Shivam", "Sharma", 29000, 48));
        employeeList.add(new Employee(4, "Himanshu", "Bhansali", 25000, 46));
        employeeList.add(new Employee(5, "Mayank", "Singh", 19000, 28));
        employeeList.add(new Employee(6, "Nishant", "Verma", 29000, 23));

        employeeList.forEach(e -> employeeRepository.save(e));
    }

    //JPQL Q1
    @Test
    public void testFindFirstNameAndLAstNameGreaterThanAverageSalary() {
        List<Object[]> emp = employeeRepository.findFirstNameAndLAstNameGreaterThanAverageSalary(employeeRepository.findAvgSalary(),Sort.by(Sort.Order.asc("age"),(Sort.Order.desc("salary"))));
        for (Object[] objects : emp) {
            System.out.println("First Name: " + objects[0]);
            System.out.println("Last Name: " + objects[1]);
        }
    }

   //JPQL Q2
    @Test
    public void testUpdateEmployeeWithSalaryGreaterThanAverageSalary(){
        System.out.println(">>>>>>>>>>>>>>>>Average Salary: "+ employeeRepository.findAvgSalary());

        employeeRepository.updateSalary(employeeRepository.findAvgSalary());
        employeeRepository.findAllEmployees().forEach(e-> System.out.println(e));
    }

    //JPQL Q3
    @Test
    public void testDeleteMinSalary(){
        System.out.println(">>>>>>>>>>>>>>>>Minimum Salary: "+ employeeRepository.findMinSalary());

        employeeRepository.deleteMinSalaryEmployees(employeeRepository.findMinSalary());
        employeeRepository.findAllEmployees().forEach(e-> System.out.println(e));
    }


    //Native SQL Query Q1
    @Test
    public void testFindByLastName(){
        List<Object[]> emp =employeeRepository.findByLastName();
        for (Object[] objects : emp) {
            System.out.println("Id: " + objects[0]);
            System.out.println("First Name: " + objects[1]);
            System.out.println("Age: " + objects[2]);

        }
    }

    //Native SQL Query Q2
    @Test
    public void testDeleteEmployeeByAge() {
        employeeRepository.deleteEmployee(46);
    }
}


