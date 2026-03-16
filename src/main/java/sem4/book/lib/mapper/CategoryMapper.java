package sem4.book.lib.mapper;

import lombok.Builder;
import sem4.book.lib.dto.CategoryRequestDto;
import sem4.book.lib.dto.CategoryResponseDto;
import sem4.book.lib.model.Category;

@Builder
public class CategoryMapper 
{
	// Request DTO > Entity
    public static Category toEntity(CategoryRequestDto dto) 
    {

        return Category.builder()
                .name(dto.getName())
                .description(dto.getDescription())
                .createdAt(dto.getCreatedAt())
                .build();
    }

    // Entity > Response DTO
    public static CategoryResponseDto toResponse(Category category) 
    {

        return CategoryResponseDto.builder()
                .id(category.getId())
                .name(category.getName())
                .description(category.getDescription())
                .createdAt(category.getCreatedAt())
                .build();
    }


}
