package com.example.Backend.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.Dto.ProfesseurDto;
import com.example.Backend.Services.ProfesseurServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/Professeur")
@RequiredArgsConstructor
public class ProfesseurController {

	
private final ProfesseurServiceImpl Professeurservices;
	
	@GetMapping("/allProfesseur")
    public List<ProfesseurDto> findAllProfesseurs()
	{
		return Professeurservices.findAll();
	}
	@GetMapping("/{id}")
    public ProfesseurDto findProfesseurbyid(@PathVariable Long id)
	{
		return Professeurservices.findProfById(id);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteClasses(@PathVariable("id") Long id){
		Professeurservices.deleteProfById(id);
		return ResponseEntity.noContent().build();
	}
}
