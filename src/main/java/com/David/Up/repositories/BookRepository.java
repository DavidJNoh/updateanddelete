package com.David.Up.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.David.Up.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	List<Book> findAll();
//	List<Book> findByDescriptionContaining(String search);
//	    // this method counts how many titles contain a certain string
//	Long countByTitleContaining(String search);
//	    // this method deletes a book that starts with a specific title
//	Long deleteByTitleStartingWith(String search);
}
