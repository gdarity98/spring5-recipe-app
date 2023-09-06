package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gd on 9/6/2023
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
