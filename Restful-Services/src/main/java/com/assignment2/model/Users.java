package com.assignment2.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/*static filtering
@JsonIgnoreProperties(value = {"rollNo"})*/

//dynamic filtering
//@JsonFilter("UsersFilter")
public class Users {

    private String FirstName;
    private String LastName;
    private int rollNo;
    private String State;

    protected Users(){}

    public Users(String firstName, String lastName, int rollNo, String state) {
        FirstName = firstName;
        LastName = lastName;
        this.rollNo = rollNo;
        State = state;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
