package com.Author.author_book.ManyToMany.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Books2 {
    @Id
    private int id;
    private String bookName;

    //Q8
    @ManyToMany(mappedBy = "books2List")
    private List<Author2> author2List;

    public Books2() {
    }

    public Books2(int id, String bookName, List<Author2> author2List) {
        this.id = id;
        this.bookName = bookName;
        this.author2List = author2List;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<Author2> getAuthor2List() {
        return author2List;
    }

    public void setAuthor2List(List<Author2> author2List) {
        this.author2List = author2List;
    }

    @Override
    public String toString() {
        return "Books2{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author2List=" + author2List +
                '}';
    }
}
