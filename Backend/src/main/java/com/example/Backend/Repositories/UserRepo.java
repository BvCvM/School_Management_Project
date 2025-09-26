package com.example.Backend.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.Backend.Models.User;

import jakarta.transaction.Transactional;

public interface UserRepo extends JpaRepository<User, Long>  {

	
	boolean existsByEmail(String email);
	   Optional<User>  findByEmail(String email);
	   @Modifying
	   @Transactional
	   @Query("update User u set u.password = ?2 where u.email = ?1 ")
	  void updatePassword(String email, String password);
}
