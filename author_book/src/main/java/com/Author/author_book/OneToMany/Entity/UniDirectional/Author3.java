package com.Author.author_book.OneToMany.Entity.UniDirectional;

import com.Author.author_book.Entity.Address;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author3 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    //Q3
    @ElementCollection
    @CollectionTable(name = "subjects3", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "SubjectName")
    private List<String> subjects;

    //Q2
    @Embedded
    private Address address;

    //Q7
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Books3> books3;

    public Author3() {
    }

    public Author3(int id, String name, List<String> subjects, Address address, List<Books3> books3) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.address = address;
        this.books3 = books3;
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

    public List<Books3> getBooks3() {
        return books3;
    }

    public void setBooks3(List<Books3> books3) {
        this.books3 = books3;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Author1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books3=" + books3 +
                ", subjects=" + subjects +
                ", address=" + address +
                '}';
    }

}
