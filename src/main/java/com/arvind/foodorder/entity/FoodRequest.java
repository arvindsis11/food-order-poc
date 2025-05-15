package com.arvind.foodorder.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodRequest {
    private String name;
    private List<String> ingredients;
    private Long chefId;

    // Getters and setters
}
