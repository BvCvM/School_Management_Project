package com.example.Backend.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.Backend.Dto.ClasseDto;
import com.example.Backend.Models.Classe;
import com.example.Backend.Repositories.ClasseRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClasseServiceImpl implements ClasseService{



    private final ClasseRepo classesRepository;
    @Override
    public List<ClasseDto> findAllClasses() {
        List<Classe> classesList = classesRepository.findAll();
        return classesList.stream()
                          .map(ClasseDto::toDTO)
                          .collect(Collectors.toList());
    }

    @Override
    public ClasseDto findClassebyid(Long id) {
        Classe c = classesRepository.findById(id)
                                     .orElseThrow(() -> new RuntimeException("Classe non trouvée avec id: " + id));
        return ClasseDto.toDTO(c);
    }

    @Override
    public ClasseDto CreateClasse(ClasseDto classeDto) {
    	Classe classes = ClasseDto.toEntity(classeDto);
        Classe saved = classesRepository.save(classes);
        return ClasseDto.toDTO(saved);
    }

    @Override
    public void DeleteById(Long id) {
        if (!classesRepository.existsById(id)) {
            throw new RuntimeException("Classe introuvable avec id: " + id);
        }
        classesRepository.deleteById(id);
    }

	@Override
	public ClasseDto UpdateClasse(ClasseDto a) {
		// TODO Auto-generated method stub
		 Classe classe = classesRepository.findById(a.getId())
                 .orElseThrow(() -> new RuntimeException("Classe non trouvée avec id: " + a.getId()));
		 
		 classe.setTitre(a.getTitre());
		 classe.setAnneescolaire(a.getAnneescolaire());
		 Classe classsaved = classesRepository.save(classe);
		return ClasseDto.toDTO(classsaved);
	}
    
	
/*@Override
	   public List<Labelvalueclasse> listeclasse() {
	       return classesRepository.findAll()
	               .stream()
	               .map(Labelvalueclasse::fromEntity)
	               .collect(Collectors.toList());
	   }*/
	
}
