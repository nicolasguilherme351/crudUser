package com.example.crudUser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudUser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
