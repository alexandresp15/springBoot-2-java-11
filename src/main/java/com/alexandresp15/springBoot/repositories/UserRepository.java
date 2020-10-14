package com.alexandresp15.springBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandresp15.springBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
