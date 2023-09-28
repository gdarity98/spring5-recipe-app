package guru.springframework.spring5recipeapp.service;

import guru.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

/**
 * Created by gd on 9/28/2023
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
