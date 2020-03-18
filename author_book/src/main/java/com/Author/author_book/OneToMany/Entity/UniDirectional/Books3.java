package com.Author.author_book.OneToMany.Entity.UniDirectional;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books3 {
    @Id
    private int id;
    private String bookName;

    public Books3(  ) {
    }

    public Books3(int id, String bookName) {
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
        return "Books1{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
