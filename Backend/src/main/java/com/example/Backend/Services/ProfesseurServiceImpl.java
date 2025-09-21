package com.example.Backend.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.Backend.Dto.ProfesseurDto;
import com.example.Backend.Models.Professeur;
import com.example.Backend.Repositories.ProfesseurRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProfesseurServiceImpl {
	
	private final ProfesseurRepo professeurRepository;
	

	
	public List<ProfesseurDto> findAll(){
	    return professeurRepository.findAll()
	        .stream()
	        .map(ProfesseurDto::toDTO)
	        .collect(Collectors.toList());        
	}
	
	
	public ProfesseurDto findProfById(Long id) {
		Optional<Professeur> optionalprof =professeurRepository.findById(id);
		optionalprof.orElseThrow(() -> new RuntimeException("prf not found with id : " +id ));
		return ProfesseurDto.toDTO(optionalprof.get());
	}
	public void deleteProfById(Long idprof) {
		professeurRepository.deleteById(idprof);
	}

}
