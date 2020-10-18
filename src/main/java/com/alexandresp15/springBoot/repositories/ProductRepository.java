package com.alexandresp15.springBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandresp15.springBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
