package com.Author.author_book.OneToMany.Entity;

import com.Author.author_book.Entity.Address;
import com.Author.author_book.OneToMany.Entity.BiDirectional.Author4;
import com.Author.author_book.OneToMany.Entity.BiDirectional.Books4;
import com.Author.author_book.OneToMany.Repos.Author4Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Author4Test {

    @Autowired
    private Author4Repository author4Repository;

    @Test
    public void testCreateEmployee() {

        Author4 author1 = new Author4();
        author1.setName("Parineeta Jain");
        author1.setSubjects(Arrays.asList("Hindi", "English", "Maths"));
        author1.setAddress(new Address(4, "NewDelhi", "Delhi"));

        ArrayList<Books4> books4ArrayList = new ArrayList<>();

        Books4 book1 = new Books4();
        book1.setId(1);
        book1.setBookName("Harry Potter");
        books4ArrayList.add(book1);

        Books4 book2 = new Books4();
        book2.setId(2);
        book2.setBookName("Harry Potter Part 2");
        books4ArrayList.add(book2);

        author1.setBooks4(books4ArrayList);
        author4Repository.save(author1);

    }
    @Test
    public void testLoadAuthorDetails() {
        Author4 author1 = new Author4();
        Optional<Author4> optionalAuthor3 = author4Repository.findById(10);
        author1 = optionalAuthor3.get();
        System.out.println(author1.getName());

        List<Books4> books1List = author1.getBooks4();
        books1List.forEach(n -> System.out.println(n.getBookName()));

    }

}