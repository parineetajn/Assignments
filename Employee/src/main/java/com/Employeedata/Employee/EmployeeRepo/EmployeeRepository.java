package com.Employeedata.Employee.EmployeeRepo;

import com.Employeedata.Employee.Entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

//Q2
public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Integer> {

    List<Employee> findByName(String Name);
    List<Employee> findByNameStartingWith(String Prefix);
    List<Employee> findByAgeBetween(int age1,int age2);

}
