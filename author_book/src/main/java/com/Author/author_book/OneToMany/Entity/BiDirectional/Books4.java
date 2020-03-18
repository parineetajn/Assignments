package com.Author.author_book.OneToMany.Entity.BiDirectional;

import com.Author.author_book.OneToMany.Entity.BiDirectionalWithoutExtraTable.Author1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Books4 {
    @Id
    private int id;
    private String bookName;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author4 author4;

    public Books4() {
    }

    public Books4(int id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    public Author4 getAuthor4() {
        return author4;
    }

    public void setAuthor4(Author4 author4) {
        this.author4 = author4;
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
        return "Books4{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }

}
