package com.example.Backend.Models;

import java.sql.Date;
import java.util.List;
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
@Table(name="examen")
public class Examen {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
    private Long idExamen;
	private String numExamen;
	private Date date;
	private String duree;
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Classe> classe;
	@ManyToOne(fetch = FetchType.LAZY)
	private Professeur professeur;
	@ManyToOne(fetch = FetchType.LAZY)
	private Matiere matiere;
	@OneToMany(mappedBy = "examen", fetch = FetchType.LAZY)
	private List<Note> notes;

}
