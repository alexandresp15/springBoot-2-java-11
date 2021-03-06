package com.alexandresp15.springBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandresp15.springBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
