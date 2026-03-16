package sem4.book.lib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import sem4.book.lib.dto.CategoryRequestDto;
import sem4.book.lib.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController 
{
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/create")
	public ResponseEntity<?> createCategory(@RequestBody CategoryRequestDto request)
	{
		
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(categoryService.create(request));
	}
}
