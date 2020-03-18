package com.Author.author_book.OneToMany.Entity;

import com.Author.author_book.OneToMany.Entity.BiDirectionalWithoutExtraTable.Author1;
import com.Author.author_book.OneToMany.Repos.Author1Repository;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.Optional;

@SpringBootTest
public class cachingTest {

    @Autowired
    private Author1Repository author1Repository;

    @Autowired
    EntityManager entityManager;

    //Q9
    @Test
    @Transactional
    public void testCaching(){
        Session session=entityManager.unwrap(Session.class);
        Optional<Author1> optionalAuthor1=author1Repository.findById(5);
        Author1 author1 = optionalAuthor1.get();
        author1Repository.findById(5);
        session.evict(author1);
        author1Repository.findById(5);
    }

    //Q10
    /*Generally the @Transactional annotation is written at the service level.
    It is used to combine more than one writes on a database as a single atomic operation.
    When somebody call the method annotated with @Transactional all or none of the writes on the database is executed.*/
}
