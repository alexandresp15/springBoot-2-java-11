package com.alexandresp15.springBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandresp15.springBoot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
