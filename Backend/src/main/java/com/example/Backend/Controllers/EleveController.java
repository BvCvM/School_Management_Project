package com.example.Backend.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.Models.Eleve;
import com.example.Backend.Services.EleveService;

@RestController
@RequestMapping("/api/Eleve")
public class EleveController {
	
private EleveService Eleveservices;
	
	@GetMapping("/allEleve")
    public List<Eleve> findAllEleves()
	{
		return Eleveservices.findAllEleves();
	}
	@GetMapping("/{id}")
    public Eleve findElevebyid(@PathVariable Long id)
	{
		return Eleveservices.findElevebyid(id);
	}

}
