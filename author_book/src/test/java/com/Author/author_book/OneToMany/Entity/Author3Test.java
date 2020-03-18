package com.Author.author_book.OneToMany.Entity;

import com.Author.author_book.Entity.Address;
import com.Author.author_book.OneToMany.Entity.BiDirectionalWithoutExtraTable.Author1;
import com.Author.author_book.OneToMany.Entity.BiDirectionalWithoutExtraTable.Books1;
import com.Author.author_book.OneToMany.Entity.UniDirectional.Author3;
import com.Author.author_book.OneToMany.Entity.UniDirectional.Books3;
import com.Author.author_book.OneToMany.Repos.Author3Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Author3Test {

    @Autowired
    private Author3Repository author3Repository;

    @Test
    public void testCreateAuthor() {

        Author3 author1 = new Author3();
        author1.setName("Parineeta Jain");
        author1.setSubjects(Arrays.asList("Hindi", "English", "Maths"));
        author1.setAddress(new Address(4, "NewDelhi", "Delhi"));

        ArrayList<Books3> books3ArrayList = new ArrayList<>();

        Books3 book1 = new Books3();
        book1.setId(1);
        book1.setBookName("Harry Potter");
        books3ArrayList.add(book1);

        Books3 book2 = new Books3();
        book2.setId(2);
        book2.setBookName("Harry Potter Part 2");
        books3ArrayList.add(book2);

        author1.setBooks3(books3ArrayList);
        author3Repository.save(author1);

    }

    @Test
    public void testLoadAuthorDetails() {
        Author3 author1 = new Author3();
        Optional<Author3> optionalAuthor3 = author3Repository.findById(8);
        author1 = optionalAuthor3.get();
        System.out.println(author1.getName());

        List<Books3> books1List = author1.getBooks3();
        books1List.forEach(n -> System.out.println(n.getBookName()));

    }

}
