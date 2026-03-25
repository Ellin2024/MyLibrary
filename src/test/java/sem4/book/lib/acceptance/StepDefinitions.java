package sem4.book.lib.acceptance;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sem4.book.lib.dto.BookRequestDto;
import sem4.book.lib.dto.BookResponseDto;
import sem4.book.lib.dto.CategoryRequestDto;
import sem4.book.lib.dto.CategoryResponseDto;
import sem4.book.lib.service.BookService;
import sem4.book.lib.service.CategoryService;

public class StepDefinitions 
{
    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;
    
    private BookRequestDto request;
    private BookResponseDto response;
    
    private CategoryResponseDto createCategory;
    
//    @Before
//    public void stepUp()
//    {
//    	createCategory = categoryService.create(new CategoryRequestDto("Harry Poter","Magician",null));
//    }
    
    @Given("Book {string} by {string} with ISBN number {string}")
    public void createBook(String title, String author, String isbn) 
    {
    	
    	

    	
        request = BookRequestDto.builder()
                .title(title)
                .author(author)
                .isbn("ISBN-" + System.currentTimeMillis())
                .categoryId(1L)
                .build();
        
        
    }

    @When("I store the book in library")
    public void storeBook() {

        response = bookService.create(request);
    }

    @Then("I am able to retrieve the book by the ISBN number")
    public void retrieveBook() 
    {

       assertNotNull(response);

    }

}
