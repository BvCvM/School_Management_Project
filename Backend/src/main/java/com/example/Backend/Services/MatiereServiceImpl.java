package com.example.Backend.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.Backend.Dto.MatiereDto;
import com.example.Backend.Models.Matiere;
import com.example.Backend.Repositories.MatiereRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MatiereServiceImpl implements MatiereService {
	
	private final MatiereRepo matiereRepository;
	@Override
	public List<MatiereDto> findAllMatieres() {
		List<Matiere> classesList = matiereRepository.findAll();
        return classesList.stream()
                          .map(MatiereDto::toDTO)
                          .collect(Collectors.toList());
	}

	@Override
	public MatiereDto findMatierebyid(Long id) {
		Matiere m = matiereRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Classe non trouvée avec id: " + id));
return MatiereDto.toDTO(m);
	}

	@Override
	public MatiereDto CreateMatiere(MatiereDto a) {
		Matiere matieres = MatiereDto.toEntity(a);
		Matiere saved = matiereRepository.save(matieres);
        return MatiereDto.toDTO(saved);
	}

	@Override
	public void DeleteMatiere(Long id) {
		  if (!matiereRepository.existsById(id)) {
	            throw new RuntimeException("Classe introuvable avec id: " + id);
	        }
		  matiereRepository.deleteById(id);
		
	}

	@Override
	public MatiereDto UpdateMatiere(MatiereDto a) {
		Matiere matiere = matiereRepository.findById(a.getId())
                .orElseThrow(() -> new RuntimeException("Classe non trouvée avec id: " + a.getId()));
		 
		matiere.setCoeff(a.getCoeff());;
		matiere.setDuree(a.getDuree());
		Matiere classsaved = matiereRepository.save(matiere);
		return MatiereDto.toDTO(classsaved);
	}

	@Override
	public List<MatiereDto> ChercherMatiere(String nom) {
		List<Matiere> classesList = matiereRepository.findByNomContainingIgnoreCase(nom);
        return classesList.stream()
                          .map(MatiereDto::toDTO)
                          .collect(Collectors.toList());
		
	}
	

}
