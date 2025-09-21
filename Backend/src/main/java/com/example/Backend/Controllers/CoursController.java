package com.example.Backend.Controllers;

import java.util.List;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.Backend.Dto.CoursDto;
import com.example.Backend.Services.CoursService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/cours")
@RequiredArgsConstructor
public class CoursController {
	

    private final CoursService coursService;
  //  private final ImageStorage imageStorage;




    @GetMapping("/all")
    public List<CoursDto> findAllCours() {
        return coursService.findAllCours();
    }


    @GetMapping("/getById/{id}")
    public CoursDto findCourById(@PathVariable Long id) {
        return coursService.findCourById(id);
    }


    @PostMapping("/create")
    public CoursDto createCours(@RequestBody CoursDto coursDto, Authentication connectedUser) {
        return coursService.createCours(coursDto, connectedUser);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteCourById(@PathVariable Long id) {
        coursService.deleteCourById(id);
    }
//    @PostMapping("/uploadFile/{IdCoursDto}")
//	public CoursDto uploadImageCoursDto(@PathVariable Long IdCoursDto, @RequestParam MultipartFile image) {
//		return coursService.uploadcoursfile(IdCoursDto, image);
//	}
	
//	@GetMapping("/downloadcoursFile/{imageName}")
//	public ResponseEntity<Resource> downloadTeacherImage(@PathVariable String imageName, HttpServletRequest request) {
//		return this.imageStorage.downloadUserImage(imageName, request);
//	}
//    @GetMapping("/listallcoursbyclassandmatiere/{idclasse}/{idmatiere}")
//    public List<ListCour> listecourByClasse (@PathVariable Long idclasse , @PathVariable Long idmatiere) {
//        return coursService.findAllCoursByclasseAndmatiere(idclasse, idmatiere);
//    }
    
//    @GetMapping("/listerprof")
//    public List<Listeprof> findAllprof() {
//        return coursService.findAllprof();
//       
//    }


}
