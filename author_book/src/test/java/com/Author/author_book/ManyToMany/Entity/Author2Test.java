package com.Author.author_book.ManyToMany.Entity;

import com.Author.author_book.Entity.Address;
import com.Author.author_book.ManyToMany.Repos.Author2Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class Author2Test {

    @Autowired
    private Author2Repository author2Repository;

    @Test
    public void testCreateAuthor(){
        Author2 author2 = new Author2();
        author2.setName("Parineeta Jain");
        author2.setSubjects(Arrays.asList("Hindi", "English", "Maths"));
        author2.setAddress(new Address(4, "NewDelhi", "Delhi"));

        ArrayList<Books2> books2ArrayList= new ArrayList<>();
        Books2 book1 = new Books2();
        book1.setId(1);
        book1.setBookName("Harry Potter");
        books2ArrayList.add(book1);

        Books2 book2 = new Books2();
        book2.setId(2);
        book2.setBookName("Harry Potter Part 2");
        books2ArrayList.add(book2);

        author2.setBooks2List(books2ArrayList);
        author2Repository.save(author2);

    }

    @Test
    public void testLoadAuthorDetails() {
        Author2 author1 = new Author2();
        Optional<Author2> optionalAuthor1 = author2Repository.findById(7);
        author1 = optionalAuthor1.get();
        System.out.println(author1.getName());

        List<Books2> books1List = author1.getBooks2List();
        books1List.forEach(n -> System.out.println(n.getBookName()));

    }


}