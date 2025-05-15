package com.arvind.foodorder.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arvind.foodorder.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    Optional<Ingredient> findByName(String name);
}
