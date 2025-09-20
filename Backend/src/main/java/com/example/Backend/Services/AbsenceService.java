package com.example.Backend.Services;

import java.util.List;

import com.example.Backend.Models.Absence;


public interface AbsenceService {
	List<Absence> findAllAbsences();
	Absence findAbsencebyid(Long id);
	Absence CreateAbsence(Absence a);
}
