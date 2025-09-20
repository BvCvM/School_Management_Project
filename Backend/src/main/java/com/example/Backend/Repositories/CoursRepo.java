package com.example.Backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Backend.Models.Cours;


public interface CoursRepo extends JpaRepository<Cours, Long> {

}
