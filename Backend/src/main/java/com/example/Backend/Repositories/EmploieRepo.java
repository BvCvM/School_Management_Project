package com.example.Backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Backend.Models.EmploiDeTemps;

public interface EmploieRepo extends JpaRepository<EmploiDeTemps, Long>  {

}
