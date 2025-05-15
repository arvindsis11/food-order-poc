package com.arvind.foodorder.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arvind.foodorder.entity.Chef;

public interface ChefRepository extends JpaRepository<Chef, Long> {}
