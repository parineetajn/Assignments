package com.Author.author_book.OneToOne.Entity;

import javax.persistence.*;

//Q5
@Entity
public class Books {

    @Id
    private int id;
    private String bookName;

    //Q6
    @OneToOne(mappedBy = "books")
    private Author author;

    public Books() {
    }

    public Books(int id, String bookName) {
        this.id = id;
        this.bookName = bookName;
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

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author=" + author +
                '}';
    }
}
