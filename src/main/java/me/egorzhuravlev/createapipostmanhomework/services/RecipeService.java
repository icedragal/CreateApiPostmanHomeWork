package me.egorzhuravlev.createapipostmanhomework.services;

import me.egorzhuravlev.createapipostmanhomework.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RecipeService {
    private final Map<Long, Recipe> recipes = new HashMap<>();
    private long idGenerator = 1;
    public String add(Recipe recipe){
        recipes.put(idGenerator++, recipe);
        return  "Добавлен рецепт: \"" + recipe.getTitle() + "\", его ID: " + idGenerator;
    }

    public Recipe get(long id){
        return recipes.get(id);
    }
}
