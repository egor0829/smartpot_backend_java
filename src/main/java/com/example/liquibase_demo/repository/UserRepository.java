package com.example.liquibase_demo.repository;

import com.example.liquibase_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
