package com.Author.author_book.OneToMany.Entity.BiDirectionalWithoutExtraTable;

import com.Author.author_book.OneToMany.Entity.BiDirectionalWithoutExtraTable.Author1;

import javax.persistence.*;

@Entity
public class Books1 {
    @Id
    private int id;
    private String bookName;

    @ManyToOne
    @JoinColumn(name = "author1_id")
    private Author1 author1;

    public Books1(  ) {
    }

    public Books1(int id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    public Author1 getAuthor1() {
        return author1;
    }

    public void setAuthor1(Author1 author1) {
        this.author1 = author1;
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
                ", author1=" + author1 +
                '}';
    }
}
