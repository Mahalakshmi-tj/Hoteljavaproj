package com.crud.jpa.h2.dao;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.jpa.h2.entity.Loggs;

public interface LoggsRepository extends JpaRepository<Loggs, Integer> {

	LocalDateTime save(LocalDateTime date);

	String save(String operation);

}
