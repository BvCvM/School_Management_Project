package com.example.Backend.Models;

import java.util.List;
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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="cours")
public class Cours {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private Long id;
	private String titre;
	private String urlcours;
	private String filecours;
	@ManyToOne(fetch = FetchType.LAZY)
	private Professeur professeur; 
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Classe> classe;
	@ManyToOne(fetch = FetchType.LAZY)
	private Matiere matiere;
}
