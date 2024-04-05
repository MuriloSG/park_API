package com.example.demoparkAPI.repository;

import com.example.demoparkAPI.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}