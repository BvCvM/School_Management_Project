package com.example.Backend.Models;

import java.util.Date;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity 
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DiscriminatorValue("professeur")
public class Professeur extends User {
	@Column
	private String cin;
	@Column
	private String diplome;
	@Column
	private Date dateDebutTravail;
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Matiere> matieres;
	@OneToMany(mappedBy = "professeur", fetch = FetchType.LAZY)
	private List<Absence> absences;

}
