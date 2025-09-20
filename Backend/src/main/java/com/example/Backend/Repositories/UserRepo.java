package com.example.Backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Backend.Models.User;

public interface UserRepo extends JpaRepository<User, Long>  {

}
