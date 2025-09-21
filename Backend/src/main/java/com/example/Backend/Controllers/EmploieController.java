package com.example.Backend.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.Models.EmploiDeTemps;
import com.example.Backend.Services.EmploieService;


@RestController
@RequestMapping("/api/Emploie")
public class EmploieController {

	
	
	private EmploieService Emploieservices;
	
	@GetMapping("/allEmploie")
    public List<EmploiDeTemps> findAllEmploies()
	{
		return Emploieservices.findAllEmploies();
	}
	@GetMapping("/{id}")
    public EmploiDeTemps findEmploiebyid(@PathVariable Long id)
	{
		return Emploieservices.findEmploiebyid(id);
	}
}
