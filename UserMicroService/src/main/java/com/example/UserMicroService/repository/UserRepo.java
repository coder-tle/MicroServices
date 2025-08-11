package com.example.UserMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserMicroService.entity.User;

public interface UserRepo extends JpaRepository<User,Integer>{

}
