package com.example.demo.respositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;


public interface ProductRepositery extends JpaRepository<Product, Integer> {

	Product findByName(String name);
}