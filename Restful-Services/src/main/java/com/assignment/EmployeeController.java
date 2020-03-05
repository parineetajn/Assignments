package com.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDaoService service;

    @GetMapping("/welcome")
    public String Welcome() {
        return "Welcome to spring boot";
    }

    @GetMapping("/Employees")
    public List<Employee> getAllEmployees() {
        return service.findAllEmployees();
    }

    @GetMapping("/Employees/{id}")
    public EntityModel<Employee> getEmployeeById(@PathVariable int id) {
        Employee employee = service.findOneEmployee(id);
        if (employee == null)
            throw new EmployeeNotFoundException("id: " + id);

        EntityModel<Employee>  resource = new EntityModel<>(employee);
        ControllerLinkBuilder linkTo = ControllerLinkBuilder.linkTo(methodOn(this.getClass()).getAllEmployees());
        resource.add(linkTo.withRel("all-employees"));
        return resource;
    }

    @PostMapping("/Employees")
    public ResponseEntity<Object> addEmployee(@Valid @RequestBody Employee employee) {
        Employee addEmployee = service.createNewEmployee(employee);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(addEmployee.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/Employees/{id}")
    public void deleteEmployee(@PathVariable int id) {
        Employee employee = service.deleteEmployeeById(id);
        if (employee == null)
            throw new EmployeeNotFoundException("id: " + id);

    }

    @PutMapping("/Employees/{id}")
    public ResponseEntity<Object> updateEmployee(@PathVariable int id, @RequestBody Employee employee) {

        Employee emp = service.findOneEmployee(id);
        if (emp == null) {
            throw new EmployeeNotFoundException("id: " + id);
        }
        emp.setId(employee.getId());
        emp.setAge(employee.getAge());
        emp.setName(employee.getName());

        Employee updateEmployee = service.updateEmployee(employee);
        return new ResponseEntity(emp, HttpStatus.OK);

    }
}
