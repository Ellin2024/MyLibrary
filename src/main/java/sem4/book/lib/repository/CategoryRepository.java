package sem4.book.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sem4.book.lib.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>
{

}
