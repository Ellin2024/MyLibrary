package sem4.book.lib;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sem4.book.lib.dto.BookRequestDto;
import sem4.book.lib.model.Category;
import sem4.book.lib.service.BookService;
import sem4.book.lib.service.CategoryService;

@SpringBootTest
class MylibraryApplicationTests 
{
	
	@Autowired
    private BookService bookService;
	
	@Autowired 
	private CategoryService categoryService;

    @Test
    void testIsbnExists() 
    {
    	
    	Category category = new Category();
        category.setName("Test 1");
        category.setDescription("Create New Category");

        categoryService.save(category);

        BookRequestDto request = BookRequestDto.builder()
                .title("Test")
                .author("Author")
                .isbn("ISBN-" + System.currentTimeMillis())
                .categoryId(category.getId())
                .build(); 

        bookService.create(request);
        
        assertNotNull(bookService.getBookByIsbn(request.getIsbn()));
//        assertTrue(bookService.getBookByIsbn("12345"));
    }
	    

}

