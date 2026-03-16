package sem4.book.lib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import sem4.book.lib.dto.CategoryRequestDto;
import sem4.book.lib.dto.CategoryResponseDto;
import sem4.book.lib.mapper.CategoryMapper;
import sem4.book.lib.model.Category;
import sem4.book.lib.repository.CategoryRepository;

@Service
public class CategoryService 
{
	@Autowired
	private CategoryRepository categoryRepository;
	


	public CategoryResponseDto create(CategoryRequestDto request) 
	{
		// TODO Auto-generated method stub
		Category category = categoryRepository.save(CategoryMapper.toEntity(request));
		return CategoryMapper.toResponse(category);
	}



	public Category save(Category category) 
	{
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	
}
