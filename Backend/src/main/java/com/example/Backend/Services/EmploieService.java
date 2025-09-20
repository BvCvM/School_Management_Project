package com.example.Backend.Services;

import java.util.List;

import com.example.Backend.Models.EmploiDeTemps;


public interface EmploieService {
	List<EmploiDeTemps> findAllEmploies();
	EmploiDeTemps findEmploiebyid(Long id);
	EmploiDeTemps CreateEmploie(EmploiDeTemps e);
}
