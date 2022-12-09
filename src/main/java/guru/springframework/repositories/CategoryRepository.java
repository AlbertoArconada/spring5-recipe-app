package guru.springframework.repositories;

import guru.springframework.domain.Category;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 * Class: CategoryRepository
 * <p>
 * Created by: aarconada on 9/12/22
 * <p>
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

  Optional<Category> findByDescription(String description);
}
