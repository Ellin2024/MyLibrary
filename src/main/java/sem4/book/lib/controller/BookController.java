package sem4.book.lib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sem4.book.lib.dto.BookRequestDto;
import sem4.book.lib.model.Book;
import sem4.book.lib.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController 
{
	@Autowired
	private BookService bookService;
	
	@GetMapping
	public List<Book> getAllBooks()
	{
		return bookService.findAll();
		
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> createBook(@RequestBody BookRequestDto request)
	{
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(bookService.create(request));
	}
	
	
	@GetMapping("/{isbn}")
	public Book getBook(@PathVariable String isbn)
	{
		return bookService.getBookByIsbn(isbn);
		
	}
	
}
