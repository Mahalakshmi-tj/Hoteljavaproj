package com.crud.jpa.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.jpa.h2.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
