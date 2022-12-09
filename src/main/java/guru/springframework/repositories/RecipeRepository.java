package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Class: RecipeRepository
 * <p>
 * Created by: aarconada on 9/12/22
 * <p>
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
