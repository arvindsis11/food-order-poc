package com.arvind.foodorder.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arvind.foodorder.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {}
