package com.assignment2.controller;

import com.assignment2.Service.NewUserDao;
import com.assignment2.Service.UsersDao;
import com.assignment2.model.NewUsers;
import com.assignment2.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserVersioningController {

    @Autowired
    UsersDao usersDao;

    @Autowired
    NewUserDao newUserDao;

    //uri versioning control
    @GetMapping("/v1/Users")
    public List<Users> user1(){
        return usersDao.findAllUsers();
    }

    @GetMapping("/v2/Users")
    public  List<NewUsers> user2(){
        return newUserDao.findAllUsers();
    }

    //Request Parameter Versioning
    @GetMapping(value = "/param/Users",params = "version=1")
    public List<Users> paramUser1(){
        return usersDao.findAllUsers();
    }

    @GetMapping(value = "/param/Users",params = "version=2")
    public  List<NewUsers> paramUser2(){
        return newUserDao.findAllUsers();
    }

    //header versioning
    @GetMapping(value = "/header/Users",headers = "X-version=1")
    public List<Users> headerUser1(){
        return usersDao.findAllUsers();
    }

    @GetMapping(value = "/header/Users",headers = "X-version=2")
    public  List<NewUsers> headerUser2(){
        return newUserDao.findAllUsers();
    }

    //MimeType versioning
    @GetMapping(value = "/produces/Users",produces = "application/x-version1+json")
    public List<Users> producerUser1(){
        return usersDao.findAllUsers();
    }

    @GetMapping(value = "/produces/Users",produces = "application/x-version2+json")
    public  List<NewUsers> producerUser2(){
        return newUserDao.findAllUsers();
    }

}
