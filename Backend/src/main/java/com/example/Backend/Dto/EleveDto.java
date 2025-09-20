package com.example.Backend.Dto;

import java.time.LocalDate;

import com.example.Backend.Models.Eleve;
import com.example.Backend.Models.NiveauScolaire;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class EleveDto extends UserBaseDto{
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dob;
	private String typePaiement;
	private  NiveauScolaire niveauScolaire;
	private String statutPaiement;
	private String statutAffectation;
	public static Eleve toEntity(EleveDto request)
	{
		return Eleve.builder()
				.id(request.getId())
				.firstName(request.getFirstName())
				.lastName(request.getLastName())
				.email(request.getEmail())
				.password(request.getPassword())
				.dob(request.getDob())
				.adress(request.getAdress())
				.phone(request.getPhone())
				.niveauScolaire(request.getNiveauScolaire())
				.build();

	}
	public static EleveDto toDTO(Eleve request)
	{
		return EleveDto.builder()
				.id(request.getId())
				.firstName(request.getFirstName())
				.lastName(request.getLastName())
				.email(request.getEmail())
				.password(request.getPassword())
				.dob(request.getDob())
				.adress(request.getAdress())
				.phone(request.getPhone())
				.build();

	}

}
