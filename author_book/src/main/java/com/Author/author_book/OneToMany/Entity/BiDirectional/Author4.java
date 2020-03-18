package com.Author.author_book.OneToMany.Entity.BiDirectional;

import com.Author.author_book.Entity.Address;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author4 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    //Q3
    @ElementCollection
    @CollectionTable(name = "subjects4", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "SubjectName")
    private List<String> subjects;

    //Q2
    @Embedded
    private Address address;

    //Q7
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Books4> books4;

    public Author4() {
    }

    public Author4(int id, String name, List<String> subjects, Address address, List<Books4> books4) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.address = address;
        this.books4 = books4;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Books4> getBooks4() {
        return books4;
    }

    public void setBooks4(List<Books4> books4) {
        this.books4 = books4;
    }

    @Override
    public String toString() {
        return "Author4{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                ", address=" + address +
                ", books4=" + books4 +
                '}';
    }
}
