package com.assignment2.model;

public class NewUsers {
    private String FirstName;
    private String LastName;
    private int rollNo;
    private Address address;

    public NewUsers() {
    }

    public NewUsers(String firstName, String lastName, int rollNo, Address address) {
        FirstName = firstName;
        LastName = lastName;
        this.rollNo = rollNo;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
