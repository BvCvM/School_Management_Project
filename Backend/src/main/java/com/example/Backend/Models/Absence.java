package com.example.Backend.Models;

import java.time.LocalDate;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Absence")
public class Absence {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private Long id ;
	@Column
	private Date date;
	private String matiere;
	
	@ManyToOne(fetch = FetchType.LAZY) //l'objet ne charge pas rapidement 
	private Eleve eleve;
	@ManyToOne(fetch = FetchType.LAZY) //l'objet ne charge pas rapidement 
	private Professeur professeur;

}
