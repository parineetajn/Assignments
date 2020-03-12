package com.Employeedata.Employee;

import com.Employeedata.Employee.EmployeeRepo.EmployeeRepository;
import com.Employeedata.Employee.Entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class EmployeeApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	//Q3
	@Test
	public void testCreateEmployee(){

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee("Parineeta",1,23,"Delhi"));
		employeeList.add(new Employee("Pinki",2,24,"Noida"));
		employeeList.add(new Employee("Shivam",3,29,"Lucknow"));
		employeeList.add(new Employee("Nishant",4,21,"Delhi"));
		employeeList.add(new Employee("Himanshu",5,22,"Kolkata"));
		employeeList.add(new Employee("Akash",6,30,"Banglore"));
		employeeList.add(new Employee("Ashish",7,21,"Delhi"));

		employeeList.forEach(e -> employeeRepository.save(e));
	}

	//Q4
	@Test
	public void testUpdate(){
		Optional<Employee> employeeOptional = employeeRepository.findById(2);
		Employee employee = employeeOptional.get();
		employee.setLocation("Chandigarh");

		employeeRepository.save(employee);
	}

	//Q5(a)
	@Test
	public void testDelete(){
	if(employeeRepository.existsById(3)){
		System.out.println("Deleting Employee");
		employeeRepository.deleteById(3);
		}
	}

	//Q5(b)
	@Test
	public void testRead(){
		Optional<Employee> optionalEmployee = employeeRepository.findById(1);
		Employee employee = optionalEmployee.get();
		assertNotNull(employee);
		assertEquals("Parineeta",employee.getName());
		System.out.println("Employee name Matched!");
	}

	//Q6
	@Test
	public void testCount(){
		System.out.println("Count: "+employeeRepository.count());
	}

	//Q7
	@Test
	public void testPagingAndSorting(){
		Pageable pageable = PageRequest.of(1,2, Sort.Direction.DESC,"age");
		employeeRepository.findAll(pageable).forEach(e-> System.out.println("Name: " +e.getName()+" Age: "+e.getAge()));
	}

	//Q8
	@Test
	public void testFindByName(){
		List<Employee> emp = employeeRepository.findByName("Parineeta");
		emp.forEach(e-> System.out.println(e.getName()));
	}

	//Q9
	@Test
	public void testFindByNameStartingWithA(){
		List<Employee> emp = employeeRepository.findByNameStartingWith("A");
		emp.forEach(e-> System.out.println(e.getName()));
	}

	//Q10
	@Test
	public void testFindByAgeBetween(){
		List<Employee> emp = employeeRepository.findByAgeBetween(28,32);
		emp.forEach(e-> System.out.println("Name: " +e.getName()+" Age: "+e.getAge()));
	}



}
