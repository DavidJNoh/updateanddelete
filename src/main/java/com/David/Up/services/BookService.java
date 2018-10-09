package com.David.Up.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.David.Up.models.Book;
import com.David.Up.repositories.BookRepository;

@Service
public class BookService {
	private static final String String = null;
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	 // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    public void deleteBook (Long id) {
        bookRepository.deleteById(id);
    }
    
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
    	Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            Book x = optionalBook.get();
            x.setTitle(title);
            x.setDescription(desc);
            x.setLanguage(lang);
            x.setNumberOfPages(numOfPages);
            return bookRepository.save(x);
        }
        else {
            return null;
        }
    }
}
