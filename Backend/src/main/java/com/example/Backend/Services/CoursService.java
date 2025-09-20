package com.example.Backend.Services;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.web.multipart.MultipartFile;

import com.example.Backend.Dto.CoursDto;




public interface CoursService {
	 List<CoursDto> findAllCours();
	    CoursDto findCourById(Long id);
	    void deleteCourById(Long courId);
	   // CoursDto uploadcoursfile(Long Idarticle, MultipartFile image);
	    CoursDto createCours(CoursDto coursDto, Authentication connectedUser);


}
