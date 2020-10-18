package com.alexandresp15.springBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandresp15.springBoot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
