package com.Author.author_book.ManyToMany.Entity;

import com.Author.author_book.Entity.Address;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    //Q3
    @ElementCollection
    @CollectionTable(name = "subjects2", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "SubjectName")
    private List<String> subjects;

    //Q2
    @Embedded
    private Address address;

    //Q8
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "Author2_Book2" ,joinColumns = @JoinColumn(name = "Author_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name = "Book_id",referencedColumnName = "id"))
    private List<Books2> books2List;

    public Author2() {
    }

    public Author2(int id, String name, List<String> subjects, Address address, List<Books2> books2List) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.address = address;
        this.books2List = books2List;
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

    public List<Books2> getBooks2List() {
        return books2List;
    }

    public void setBooks2List(List<Books2> books2List) {
        this.books2List = books2List;
    }

    @Override
    public String toString() {
        return "Author2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                ", address=" + address +
                ", books2List=" + books2List +
                '}';
    }

}
