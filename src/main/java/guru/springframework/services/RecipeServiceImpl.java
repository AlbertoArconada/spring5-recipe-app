package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 * Class: RecipeServiceImpl
 * <p>
 * Created by: aarconada on 9/12/22
 * <p>
 */
@Service
public class RecipeServiceImpl implements RecipeService {

  private final RecipeRepository recipeRepository;

  public RecipeServiceImpl(RecipeRepository recipeRepository) {
    this.recipeRepository = recipeRepository;
  }

  @Override
  public Set<Recipe> getRecipes() {
    Set<Recipe> recipeSet = new HashSet<>();
    recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
    return recipeSet;
  }
}
