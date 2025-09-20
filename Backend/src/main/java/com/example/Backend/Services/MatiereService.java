package com.example.Backend.Services;

import java.util.List;

import com.example.Backend.Dto.MatiereDto;



public interface MatiereService {
	List<MatiereDto> findAllMatieres();
	MatiereDto findMatierebyid(Long id);
	MatiereDto CreateMatiere(MatiereDto a);
	void DeleteMatiere(Long id);
	MatiereDto UpdateMatiere(MatiereDto a);
	List<MatiereDto> ChercherMatiere(String a);
}
