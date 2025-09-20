package com.example.Backend.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Table(name="emptemps")
public class EmploiDeTemps {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private Long id;
	private String salle;
	private String anneescolair;
	@ManyToOne(fetch = FetchType.LAZY)
	private Matiere matiere;
	@ManyToOne(fetch = FetchType.LAZY)
	private Professeur professeur; 
	@ManyToOne(fetch = FetchType.LAZY)
	private Classe classe;

}
