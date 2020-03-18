package com.Author.author_book.OneToMany.Repos;

import com.Author.author_book.OneToMany.Entity.BiDirectionalWithoutExtraTable.Author1;
import org.springframework.data.repository.CrudRepository;

public interface Author1Repository extends CrudRepository<Author1,Integer> {
}