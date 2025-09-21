package com.example.Backend.Dto;

import java.util.Date;

import com.example.Backend.Models.Professeur;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter()
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class ProfesseurDto extends UserBaseDto {
	private String cin;
	private String diplome;
	private Date dateDebutTravail;
	
	 public static Professeur toEntity(ProfesseurDto request) 
	    {
	        return Professeur.builder() 
	                .id(request.getId())
	                .firstName(request.getFirstName())
	                .lastName(request.getLastName())
	                .email(request.getEmail())
	                .password(request.getPassword())
	                .adress(request.getAdress())
	                .phone(request.getPhone())
	                .cin(request.getCin())
	                .diplome(request.getDiplome())
	                .dateDebutTravail(request.getDateDebutTravail())
	                .build();
	    }
	 public static ProfesseurDto toDTO(Professeur request)
	    {
	        return ProfesseurDto.builder()
	                .id(request.getId())
	                .firstName(request.getFirstName())
	                .lastName(request.getLastName())
	                .email(request.getEmail())
	                .adress(request.getAdress())
	                .phone(request.getPhone())
	                .cin(request.getCin())
	                .diplome(request.getDiplome())
	                .dateDebutTravail(request.getDateDebutTravail())
	                .build();
	    }
	
}
