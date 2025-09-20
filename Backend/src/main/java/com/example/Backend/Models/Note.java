package com.example.Backend.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name="note")
public class Note {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	 private Long id;
	    private double valeur;
	    private String matiere;
	    private String type;
	    
	@ManyToOne
	@JoinColumn(name = "eleve_id")
	    private Eleve eleve;
	
	@ManyToOne
	@JoinColumn(name = "examen_id")
	private Examen examen;

}
