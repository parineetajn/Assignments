package com.assignment2.model;

public class Address {

    private String City;
    private String State;

    public Address(String city, String state) {
        City = city;
        State = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
