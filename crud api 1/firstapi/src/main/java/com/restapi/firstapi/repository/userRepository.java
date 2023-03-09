package com.restapi.firstapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.firstapi.model.User;

public interface userRepository extends JpaRepository<User, Long> {
    
}
