package com.example.Backend.Models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="classe")
public class Classe {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private Long id;
	@Column
	private String titre;
	private String anneescolaire;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "classe")
	private List<Eleve> eleves;
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "classe")
	private List<EmploiDeTemps> emploiDetemps;
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Cours> cours;
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Examen> examens;
	@ManyToOne(fetch = FetchType.LAZY)
	private Administrateur administrateur;

}
