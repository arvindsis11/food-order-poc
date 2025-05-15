package com.arvind.foodorder.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arvind.foodorder.entity.Chef;
import com.arvind.foodorder.entity.Food;
import com.arvind.foodorder.entity.Ingredient;
import com.arvind.foodorder.repo.ChefRepository;
import com.arvind.foodorder.repo.FoodRepository;
import com.arvind.foodorder.repo.IngredientRepository;

@Service
public class FoodService {

	@Autowired
	private FoodRepository foodRepo;
	@Autowired
	private IngredientRepository ingredientRepo;
	@Autowired
	private ChefRepository chefRepo;

	public Food addFood(String foodName, List<String> ingredientNames, Long chefId) {
		Chef chef = chefRepo.findById(chefId).orElseThrow(() -> new RuntimeException("Chef not found"));

		Set<Ingredient> ingredients = ingredientNames.stream()
				.map(name -> ingredientRepo.findByName(name).orElseGet(() -> ingredientRepo.save(new Ingredient(name))))
				.collect(Collectors.toSet());

		Food food = new Food();
		food.setName(foodName);
		food.setChef(chef);
		food.setIngredients(ingredients);

		return foodRepo.save(food);
	}
	
	public Optional<Food> getFoodById(Long id) {
	    return foodRepo.findById(id);
	}


}
