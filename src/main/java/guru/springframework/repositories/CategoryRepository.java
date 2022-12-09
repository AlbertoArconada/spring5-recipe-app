package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Class: CategoryRepository
 * <p>
 * Created by: aarconada on 9/12/22
 * <p>
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
