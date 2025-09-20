package com.example.Backend.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.Backend.Dto.CoursDto;
import com.example.Backend.Models.Classe;
import com.example.Backend.Models.Cours;
import com.example.Backend.Models.Matiere;
import com.example.Backend.Models.Professeur;
import com.example.Backend.Repositories.ClasseRepo;
import com.example.Backend.Repositories.CoursRepo;
import com.example.Backend.Repositories.MatiereRepo;
import com.example.Backend.Repositories.ProfesseurRepo;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CoursServiceImpl implements CoursService {
    private final CoursRepo coursRepository;
    private final ProfesseurRepo professeurRepository;
    private final ClasseRepo classesRepository;
   // private final ImageStorage imageStorage;
    private final MatiereRepo matiereRepository;


    @Override
    public List<CoursDto> findAllCours() {
        return coursRepository.findAll().stream()
                .map(CoursDto::fromEntity)
                .collect(Collectors.toList());
    }
    @Override
    public CoursDto findCourById(Long id) {
        Optional<Cours> optionalCours = coursRepository.findById(id);
        optionalCours.orElseThrow(() -> new RuntimeException("Cours not found with id: " + id));
        return CoursDto.fromEntity(optionalCours.get());
    }


   @Override
    public CoursDto createCours(CoursDto coursDto ,Authentication connectedUser) {
//        Professeur professeur = professeurRepository.findById(coursDto.getProfesseurId(), Authentication connectedUser,)
//                .orElseThrow(() -> new EntityNotFoundException("No Professeur found with ID:: " + coursDto.getProfesseurId()));
        Professeur professeur = ((Professeur) connectedUser.getPrincipal());
        Matiere matiere = matiereRepository.findById(coursDto.getMatiereId())
                .orElseThrow(() -> new EntityNotFoundException("No Matiere found with ID:: " + coursDto.getMatiereId()));


        List<Classe> classes= new ArrayList<>();
        if (coursDto.getClassesIds().isEmpty()) {
            throw new IllegalArgumentException("you need atleast on classes");
        } else {
            for (Long classeId : coursDto.getClassesIds()) {
                Optional<Classe> classes1 = classesRepository.findById(classeId);
                classes1.ifPresent(classes::add);
            }
        }
        Cours cours = CoursDto.toDTO(coursDto);
        cours.setClasse(classes);
        cours.setProfesseur(professeur);
        cours.setMatiere(matiere);
        return CoursDto.fromEntity(coursRepository.save(cours));
    }  

/*
    @Override
    public List<ListCour> findAllCoursByclasseAndmatiere(Long classId, Long matiereId) {
        return coursRepository.findByClasses_IdAndMatiere_Id(classId,matiereId).stream()
                .map(ListCour::fromEntity)
                .collect(Collectors.toList());
    }
*/

    @Override
    public void deleteCourById(Long courId) {
        coursRepository.deleteById(courId);
    }
    public ResponseEntity<Cours> findbyId(Long id) {
        if (id == null) {
          //  log.error("student ID is null");
            return null;
        }
        return ResponseEntity.ok(coursRepository.findById(id).get());
                
    }
  /*  
@Override
public CoursDto uploadcoursfile(Long IdCours, MultipartFile image) {
	 ResponseEntity<Cours> coursResponse = this.findbyId(IdCours);
        String imageName=imageStorage.store(image);
        String fileImageDownloadUrl= ServletUriComponentsBuilder.fromCurrentContextPath().path("api/cours/downloadcoursFile/").path(imageName).toUriString();
        Cours cours = coursResponse.getBody();
       
        if (cours!=null)
        	cours.setFilecours(fileImageDownloadUrl); 
        Cours courssaved = coursRepository.save(cours);
        return  CoursDto.fromEntity(courssaved);
        		 
}
*/
/*
   @Override
   public List<Listeprof> findAllprof() {
       return professeurRepository.findAll().stream()
               .map(Listeprof::fromEntity)
               .collect(Collectors.toList());
   }*/
}
