package com.example.Backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Backend.Models.Professeur;

public interface ProfesseurRepo extends JpaRepository<Professeur, Long>  {

}
