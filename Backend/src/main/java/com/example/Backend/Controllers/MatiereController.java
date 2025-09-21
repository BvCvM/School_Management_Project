package com.example.Backend.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.Dto.MatiereDto;
import com.example.Backend.Services.MatiereService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/matiere")
@RequiredArgsConstructor
public class MatiereController {
	
	private final MatiereService matiereservices;
	
	@GetMapping("/lister")
	public List<MatiereDto> findAllMatieres() {
		return matiereservices.findAllMatieres();
	}
	
	@GetMapping("/getById/{id}")
	public MatiereDto findMatierebyid(@PathVariable Long id) {
		return matiereservices.findMatierebyid(id);
	}
	
	@PostMapping("/save")
	public MatiereDto CreateMatiere(@RequestBody MatiereDto a) {
		return matiereservices.CreateMatiere(a);
	}
	
	@DeleteMapping("/delete/{id}")
	public void DeleteMatiere(@PathVariable Long id) {
		matiereservices.DeleteMatiere(id);
	}
	
	@PostMapping("/update")
	public MatiereDto UpdateMatiere(@RequestBody MatiereDto a) {
		return matiereservices.UpdateMatiere(a);
	}
	
	@GetMapping("/getByName/{a}")
	public List<MatiereDto> ChercherMatiere(@PathVariable String a) {
		return matiereservices.ChercherMatiere(a);
	}
	

}
