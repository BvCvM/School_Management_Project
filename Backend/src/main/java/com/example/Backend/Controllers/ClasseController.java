package com.example.Backend.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.Backend.Dto.ClasseDto;
import com.example.Backend.Services.ClasseService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/classes")
@RequiredArgsConstructor
public class ClasseController {
	
	private final ClasseService classesServices;

	@GetMapping("/lister")
	public List<ClasseDto> findAllClasses() {
		return classesServices.findAllClasses();
	}
	@GetMapping("/getById/{id}")
	public ClasseDto findClassebyid(@PathVariable	Long id) {
		return classesServices.findClassebyid(id);
	}
	@PostMapping("/save")
	public ClasseDto CreateClasse(@RequestBody ClasseDto a) {
		return classesServices.CreateClasse(a);
	}
	@DeleteMapping("/delete/{id}")
	public void DeleteById(@PathVariable Long id) {
		classesServices.DeleteById(id);
	}
	@PostMapping("/update")
	public ClasseDto UpdateClasse(@RequestBody ClasseDto a) {
		return classesServices.UpdateClasse(a);
	}
	

	

}
