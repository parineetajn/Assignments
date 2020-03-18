package com.Author.author_book.OneToMany.Entity.BiDirectionalWithoutExtraTable;

import com.Author.author_book.Entity.Address;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Author1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    //Q3
    @ElementCollection
    @CollectionTable(name = "subjects1", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "SubjectName")
    private List<String> subjects;

    //Q2
    @Embedded
    private Address address;

    //Q7
    @OneToMany(mappedBy = "author1",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Books1> books1;

    public Author1() {
    }

    public Author1(int id, String name, List<String> subjects, Address address, List<Books1> books1) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.address = address;
        this.books1 = books1;
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

    public List<Books1> getBooks1() {
        return books1;
    }

    public void setBooks1(List<Books1> books1) {
        this.books1 = books1;
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
                ", books1=" + books1 +
                ", subjects=" + subjects +
                ", address=" + address +
                '}';
    }

    public void addBook(Books1 books){
        if(books!=null){
            if(books1==null){
                books1= new ArrayList<>();
            }
            books.setAuthor1(this);
            books1.add(books);
        }

    }
}
