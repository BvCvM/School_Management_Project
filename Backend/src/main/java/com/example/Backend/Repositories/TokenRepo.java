package com.example.Backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Backend.AuthFolder.Token;


public interface TokenRepo extends JpaRepository<Token, Long> {

}
