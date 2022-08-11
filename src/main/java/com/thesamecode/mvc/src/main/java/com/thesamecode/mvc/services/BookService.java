package com.thesamecode.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.thesamecode.mvc.models.Book;
import com.thesamecode.mvc.repositories.BookRepository;

@Service
public class BookService {
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
    // updates a book info
    public Book updateBook(Book b) {
    	return bookRepository.save(b);
    }
    // deletes a book
    public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
}