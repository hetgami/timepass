package com.personal.society.management.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.society.management.app.entity.Society;

public interface SocietyRepository extends JpaRepository<Society, Integer>{
	Society findBySocietyKey(String societyKey);
}
