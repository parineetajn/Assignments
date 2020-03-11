package com.assignment2.controller;

import com.assignment2.model.Users;
import com.assignment2.Service.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private UsersDao usersDao;

    @GetMapping("/All-Users")
    public List<Users> getAllUsers() {
        return usersDao.findAllUsers();
    }

    @PostMapping("/Users")
    public ResponseEntity<Object> addUser(@Valid @RequestBody Users users) {
       Users addUser = usersDao.createNewUsers(users);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(addUser.getRollNo()).toUri();
        return ResponseEntity.created(location).build();
    }

    //Q1
    @GetMapping("/hello-internationalization/{rollNo}")
    public String HelloInternationalization(@PathVariable int rollNo){

        Users users = usersDao.findOneUser(rollNo);
        String[] params = {users.getFirstName()};
       return messageSource.getMessage("hello.message", params, LocaleContextHolder.getLocale());
    }

    //Q11
    @GetMapping("/Users/{rollNo}")
    public EntityModel<Users> getAUser(@PathVariable int rollNo) {
        Users user =  usersDao.findOneUser(rollNo);

        EntityModel<Users> resource = new EntityModel(user);
        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getAllUsers());
        resource.add(linkTo.withRel("all-users"));

        return resource;
    }
}
