package sem4.book.lib.mapper;

import lombok.Builder;
import sem4.book.lib.dto.BookRequestDto;
import sem4.book.lib.dto.BookResponseDto;
import sem4.book.lib.model.Book;
import sem4.book.lib.model.Category;

@Builder
public class BookMapper 
{
	// Request DTO → Entity
    public static Book toEntity(BookRequestDto dto) 
    {
    	
    	Category category = new Category();
    	category.setId(dto.getCategoryId());

        return Book.builder()
                .title(dto.getTitle())
                .author(dto.getAuthor())
                .isbn(dto.getIsbn())
                .description(dto.getDescription())
                .createdAt(dto.getCreatedAt())
                .publishDate(dto.getPublishDate())
                .category(category)
                .build();
    }
    
 // Entity → Response DTO
    public static BookResponseDto toResponse(Book book) 
    {

        return BookResponseDto.builder()
        		.id(book.getId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .isbn(book.getIsbn())
                .description(book.getDescription())
                .publishDate(book.getPublishDate())
                .createdAt(book.getCreatedAt())
                .categoryId(book.getCategory().getId())
                .build();
    }
    
}
