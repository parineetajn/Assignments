package com.Author.author_book.OneToOne.Entity;

import com.Author.author_book.Entity.Address;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    //Q3
    @ElementCollection
    @CollectionTable(name = "subjects", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "SubjectName")
    private List<String> subjects;

    //Q6
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Books books ;

    //Q2
    @Embedded
    Address address;

    public Author() {
    }

    public Author(int id, String name, List<String> subjects, Books books, Address address) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.books = books;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                ", books=" + books +
                ", address=" + address +
                '}';
    }
}
