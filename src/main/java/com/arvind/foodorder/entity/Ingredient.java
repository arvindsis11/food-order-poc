package com.arvind.foodorder.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Ingredient {
	public Ingredient(String name2) {
		// TODO Auto-generated constructor stub
		this.name = name2;
	}

	@Id
	@GeneratedValue
	private Long id;

	@Column(unique = true)
	private String name;
}
