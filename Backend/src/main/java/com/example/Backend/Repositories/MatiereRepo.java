package com.example.Backend.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Backend.Models.Matiere;

public interface MatiereRepo extends JpaRepository<Matiere, Long>  {
	List<Matiere> findByNomContainingIgnoreCase(String nom);
}
