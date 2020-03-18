package com.Author.author_book.OneToMany.Entity;

import com.Author.author_book.Entity.Address;
import com.Author.author_book.OneToMany.Entity.BiDirectionalWithoutExtraTable.Author1;
import com.Author.author_book.OneToMany.Entity.BiDirectionalWithoutExtraTable.Books1;
import com.Author.author_book.OneToMany.Repos.Author1Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class Author1Test {

    @Autowired
    private Author1Repository author1Repository;

    @Test
    public void testCreateAuthor() {

        Author1 author1 = new Author1();
        author1.setName("Parineeta Jain");
        author1.setSubjects(Arrays.asList("Hindi", "English", "Maths"));
        author1.setAddress(new Address(4, "NewDelhi", "Delhi"));

        Books1 book1 = new Books1();
        book1.setId(1);
        book1.setBookName("Harry Potter");

        Books1 book2 = new Books1();
        book2.setId(2);
        book2.setBookName("Harry Potter Part 2");

        author1.addBook(book1);
        author1.addBook(book2);

        author1Repository.save(author1);

        Author1 author2 = new Author1();
        author2.setName("Pinki Bhati");
        author2.setSubjects(Arrays.asList("Science", "English", "Maths"));
        author2.setAddress(new Address(12, "Palam", "Delhi"));

        Books1 book3 = new Books1();
        book3.setId(3);
        book3.setBookName("Twilight");

        Books1 book4 = new Books1();
        book4.setId(4);
        book4.setBookName("Twilight Part 2");

        author2.addBook(book3);
        author2.addBook(book4);

        author1Repository.save(author2);

    }

    @Test
    public void testLoadAuthorDetails() {
        Author1 author1 = new Author1();
        Optional<Author1> optionalAuthor1 = author1Repository.findById(5);
        author1 = optionalAuthor1.get();
        System.out.println(author1.getName());

        List<Books1> books1List = author1.getBooks1();
        books1List.forEach(n -> System.out.println(n.getBookName()));

    }


}
