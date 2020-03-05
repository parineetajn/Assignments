package com.assignment;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.sql.Types.NULL;

@Component
public class EmployeeDaoService {
    private static List<Employee> emp = new ArrayList<>();

    private static int empCount = 5;

    static {
        emp.add(new Employee(1, "Parineeta", 23));
        emp.add(new Employee(2, "Pinki", 24));
        emp.add(new Employee(3, "Himanshu", 25));
        emp.add(new Employee(4, "Shivam", 22));
        emp.add(new Employee(5, "Azeem", 23));
    }

    public List<Employee> findAllEmployees() {
        return emp;
    }

    public Employee createNewEmployee(Employee employee) {
        if (employee.getId() == NULL)
            employee.setId(++empCount);
        emp.add(employee);
        return employee;
    }

    public Employee findOneEmployee(int id) {
        for (Employee employee : emp) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public Employee deleteEmployeeById(int id) {
        Iterator<Employee> iterator = emp.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
                return employee;
            }
        }
        return null;
    }

    public Employee updateEmployee(Employee employee){
        emp.add(employee);
        return employee;
    }


}
