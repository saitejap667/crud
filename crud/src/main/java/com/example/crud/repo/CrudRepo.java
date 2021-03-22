package com.example.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.model.Product;

public interface CrudRepo extends JpaRepository<Product, Integer> {

}
