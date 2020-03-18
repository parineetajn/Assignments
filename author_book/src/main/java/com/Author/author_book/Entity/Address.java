package com.Author.author_book.Entity;

import javax.persistence.Embeddable;

//Q1
@Embeddable
public class Address {

    private int streetNo;
    private String location;
    private String state;

    public Address() {
    }

    public Address(int streetNo, String location, String state) {
        this.streetNo = streetNo;
        this.location = location;
        this.state = state;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNo=" + streetNo +
                ", location='" + location + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
