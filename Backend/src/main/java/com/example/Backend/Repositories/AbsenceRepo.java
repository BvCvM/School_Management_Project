package com.example.Backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Backend.Models.Absence;

public interface AbsenceRepo extends JpaRepository<Absence, Long> {

}
