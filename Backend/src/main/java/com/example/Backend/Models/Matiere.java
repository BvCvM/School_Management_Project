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
@Table(name="matiere")
public class Matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private int coeff;
    private String nom;
    private String cover;
    private Integer duree;

    @OneToMany(mappedBy = "matiere", fetch = FetchType.LAZY)
    private List<Cours> cours;
    @OneToMany(fetch = FetchType.LAZY)
    private List<EmploiDeTemps> seancs;

    @OneToMany(mappedBy = "matiere", fetch = FetchType.LAZY)
    private List<Examen> examens;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Professeur> professeur;

    @ManyToOne(fetch = FetchType.LAZY)
    private Administrateur administrateur;
}


