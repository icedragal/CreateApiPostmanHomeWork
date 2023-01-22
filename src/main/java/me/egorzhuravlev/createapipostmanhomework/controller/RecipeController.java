package me.egorzhuravlev.createapipostmanhomework.controller;

import me.egorzhuravlev.createapipostmanhomework.model.Recipe;
import me.egorzhuravlev.createapipostmanhomework.services.RecipeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    @PostMapping
    public String add(@RequestBody Recipe recipe){
        return recipeService.add(recipe);
    }

    @GetMapping("/{id}")
    public Recipe get(@PathVariable long id){
        return recipeService.get(id);
    }
}
