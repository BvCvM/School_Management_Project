package com.example.Backend.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Backend.Models.Absence;
import com.example.Backend.Services.AbsenceService;

@RestController
@RequestMapping("/api/Absence")
public class AbsenceController {
private AbsenceService Absenceservices;
	
	@GetMapping("/allAbsence")
    public List<Absence> findAllAbsences()
	{
		return Absenceservices.findAllAbsences();
	}
	@GetMapping("/{id}")
    public Absence findAbsencebyid(@PathVariable Long id)
	{
		return Absenceservices.findAbsencebyid(id);
	}

}
