package com.Author.author_book.OneToOne.Repos;

import com.Author.author_book.OneToOne.Entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer> {


}
