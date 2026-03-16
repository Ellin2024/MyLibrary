package sem4.book.lib.service;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sem4.book.lib.dto.BookRequestDto;
import sem4.book.lib.dto.BookResponseDto;
import sem4.book.lib.mapper.BookMapper;
import sem4.book.lib.model.Book;
import sem4.book.lib.repository.BookRepository;

@Service
public class BookService 
{
	@Autowired
	private BookRepository bookRepository;

	//Read all
	public List<Book> findAll() 
	{
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	//Create book
	public BookResponseDto create(BookRequestDto request) 
	{
		// TODO Auto-generated method stub
		Book book = bookRepository.save(BookMapper.toEntity(request));
		return BookMapper.toResponse(book);
	}

	public Book getBookByIsbn(String isbn) 
	{
		
		// TODO Auto-generated method stub
		return bookRepository.findByIsbn(isbn);
	}

	public boolean findByIsbn(String string) {
		// TODO Auto-generated method stub
		return false;
	}




	
	//Read by id
//	public Book getBookById(Long id) 
//	{
//		// TODO Auto-generated method stub
//		return bookRepository.findById(id).get();
//	}

//	public Book updateBook(Long id, Book book) 
//	{
//		// TODO Auto-generated method stub
//		Book existingBook = bookRepository.findById(id).orElse(null);
//
//        if (existingBook != null) {
//            existingBook.setTitle(book.getTitle());
//            existingBook.setAuthor(book.getAuthor());
//            existingBook.setDescription(book.getDescription());
//
//            return bookRepository.save(existingBook);
//        }
//
//        return null;
//	}
//


	
	
	
}
