package guru.springframework.services;

import guru.springframework.domain.Recipe;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 * Class: RecipeService
 * <p>
 * Created by: aarconada on 9/12/22
 * <p>
 */
public interface RecipeService {

  Set<Recipe> getRecipes();
}
