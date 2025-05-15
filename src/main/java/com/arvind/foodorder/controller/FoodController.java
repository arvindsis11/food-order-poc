package com.arvind.foodorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arvind.foodorder.entity.Food;
import com.arvind.foodorder.entity.FoodRequest;
import com.arvind.foodorder.service.FoodService;

@RestController
@RequestMapping("/foods")
public class FoodController {

    @Autowired private FoodService foodService;

    @PostMapping
    public ResponseEntity<Food> addFood(@RequestBody FoodRequest request) {
        Food food = foodService.addFood(request.getName(), request.getIngredients(), request.getChefId());
        return ResponseEntity.ok(food);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Food> getFood(@PathVariable Long id) {
        return ResponseEntity.of(foodService.getFoodById(id));
    }
}
