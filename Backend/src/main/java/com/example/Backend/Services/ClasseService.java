package com.example.Backend.Services;

import java.util.List;
import com.example.Backend.Dto.ClasseDto;


public interface ClasseService {
	
	List<ClasseDto> findAllClasses();
	ClasseDto findClassebyid(Long id);
	ClasseDto CreateClasse(ClasseDto a);
	ClasseDto UpdateClasse(ClasseDto a);
	void DeleteById(Long id);
}
