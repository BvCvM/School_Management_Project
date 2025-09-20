package com.example.Backend.Models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
@Entity 
@Data
@SuperBuilder
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("eleve")
public class Eleve extends User {
	@Column
	private LocalDate dob;
	@Enumerated(EnumType.STRING)
	private  NiveauScolaire niveauScolaire;
	@OneToMany(mappedBy = "eleve", fetch = FetchType.LAZY)
	private List<Note> notes;
	@OneToMany(fetch = FetchType.LAZY)
	private List<Absence> absences;
	@ManyToOne(fetch = FetchType.LAZY)
	private Classe classe;
	

}
