package com.Author.author_book.OneToOne.Entity;

import com.Author.author_book.Entity.Address;
import com.Author.author_book.OneToOne.Repos.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AuthorTest {

    @Autowired
    AuthorRepository authorRepository;

    //Q4
    @Test
    public void testCreateAuthor(){

        Author author1 =  new Author();
        author1.setName("Parineeta Jain");
        author1.setSubjects(Arrays.asList("Hindi","English","Maths"));
        author1.setAddress(new Address(4,"NewDelhi","Delhi"));
        author1.setBooks(new Books(2,"Harry Potter"));
        authorRepository.save(author1);

        Author author2 =  new Author();
        author2.setName("Pinki Bhati");
        author2.setSubjects(Arrays.asList("Science","English","Maths"));
        author2.setAddress(new Address(12,"Palam","Delhi"));
        author2.setBooks(new Books(3,"Twilight"));
        authorRepository.save(author2);
    }

    @Test
    public void testOneToOne(){
        Author author = new Author();
        author.setName("Nishant");
        author.setAddress(new Address(8,"Dwarka","Delhi"));
        author.setSubjects(Arrays.asList("English","Hindi","Science"));
        author.setBooks(new Books(1,"xyz"));
        authorRepository.save(author);
    }

}
