package com.assignment2.controller;

import com.assignment2.model.Users;
import com.assignment2.Service.UsersDao;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilteringController {

    @Autowired
    private UsersDao usersDao;

    @GetMapping("/dynamic-filtering")
    public MappingJacksonValue retrieveFilters(){

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("firstName");

        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("UsersFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(usersDao.findAllUsers());
        mapping.setFilters(filterProvider);
        return mapping;

    }

    @GetMapping("/static-filtering")
    public List<Users> retrieveFilters1(){
       return usersDao.findAllUsers();
    }

}
