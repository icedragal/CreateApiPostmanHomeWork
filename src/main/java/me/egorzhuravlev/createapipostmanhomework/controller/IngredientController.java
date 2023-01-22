package me.egorzhuravlev.createapipostmanhomework.controller;

import me.egorzhuravlev.createapipostmanhomework.model.Ingredient;
import me.egorzhuravlev.createapipostmanhomework.services.IngredientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping
    public Ingredient add(@RequestBody Ingredient ingredient) {
        return ingredientService.add(ingredient);
    }

    @GetMapping("/{id}")
    public Ingredient get(@PathVariable long id) {
        return ingredientService.get(id);
    }
}
