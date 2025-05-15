package com.arvind.foodorder.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arvind.foodorder.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {}
