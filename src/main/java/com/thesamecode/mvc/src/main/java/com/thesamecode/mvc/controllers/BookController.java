package com.thesamecode.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.thesamecode.mvc.models.Book;
import com.thesamecode.mvc.services.BookService;


// controller renders the jsp page, rest controller pushes in static info
@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/books/{bookId}")
	public String show(Model model, @PathVariable("bookId") Long bookId) {
		
//		System.out.println(bookId);
		Book book = bookService.findBook(bookId);
//		System.out.println(book);
		
//		List<Book> books = bookService.allBooks();
		
		model.addAttribute("book", book);
//		model.addAttribute("books", books);
		
		return "show.jsp";
	}
	
	@GetMapping("/")
	public String home(Model model) {
		return "redirect:/books";
	}
	
	@GetMapping("/books")
	public String index(Model model) {
		
		List<Book> books = bookService.allBooks();
//		Book book = bookService.findBook(bookId);
		model.addAttribute("books", books);
		
		return "index.jsp";
	}
	
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "new.jsp";
	}
	
//	@PostMapping("/books")
//	public String create(
//	    @RequestParam("title") String title,
//	    @RequestParam("description") String description,
//	    @RequestParam("language") String language,
//	    @RequestParam("numberOfPages") Integer numberOfPages) 
//	{
//	    // CODE TO MAKE A NEW BOOK AND SAVE TO THE DB
//	    Book book = new Book(title, description, language, numberOfPages);
//	    bookService.createBook(book);
//	    return "redirect:/books";
//	}
	
	@PostMapping("/books")
	public String create(
			@Valid @ModelAttribute ("book") Book book,
			BindingResult result)
	{
		if (result.hasErrors()) {
			return "new.jsp";
		}
		bookService.createBook(book);
		return "redirect:/books";
	}
	
//	@GetMapping("/books/2")
//	public String index() {
//		return "index.jsp";
//	}


}
