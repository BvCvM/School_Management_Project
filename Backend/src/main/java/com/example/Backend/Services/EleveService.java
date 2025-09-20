package com.example.Backend.Services;

import java.util.List;

import com.example.Backend.Models.Eleve;


public interface EleveService {
	List<Eleve> findAllEleves();
	Eleve findElevebyid(Long id);
	Eleve CreateEleve(Eleve e);
}
