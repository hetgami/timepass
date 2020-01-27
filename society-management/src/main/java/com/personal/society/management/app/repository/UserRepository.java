package com.personal.society.management.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.society.management.app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
}
