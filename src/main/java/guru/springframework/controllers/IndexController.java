package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class: IndexController
 * <p>
 * Created by: aarconada on 9/12/22
 * <p>
 */
@Controller
public class IndexController {

  private final RecipeService recipeService;

  public IndexController(RecipeService recipeService) {
    this.recipeService = recipeService;
  }

  @RequestMapping({"", "/", "/index"})
  public String getIndexPage(Model model) {

    model.addAttribute("recipes", recipeService.getRecipes());
    return "index";
  }
}
