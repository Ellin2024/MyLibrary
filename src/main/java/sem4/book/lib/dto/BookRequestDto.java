package sem4.book.lib.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookRequestDto 
{

	private String title;
	
	private String author;
	
	private String isbn;
	
	private String description;
	
	private LocalDate createdAt;
	
	private LocalDate publishDate;
	
	private Long categoryId;
}
