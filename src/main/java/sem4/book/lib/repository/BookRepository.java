package sem4.book.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sem4.book.lib.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>
{

	Book findByIsbn(String isbn);

	

}
