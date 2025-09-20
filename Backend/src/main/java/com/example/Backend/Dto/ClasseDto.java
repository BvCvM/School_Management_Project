package com.example.Backend.Dto;


import com.example.Backend.Models.Classe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClasseDto {
	private long id;
    private String titre;
    private String anneescolaire;
    
    public static Classe toEntity(ClasseDto dto) {
        return Classe.builder()
                .id(dto.getId())
                .titre(dto.getTitre())
                .anneescolaire(dto.getAnneescolaire())
                .build();
    }

    public static ClasseDto toDTO(Classe entity) {
        return ClasseDto.builder()
                .id(entity.getId())
                .titre(entity.getTitre())
                .anneescolaire(entity.getAnneescolaire())
                .build();
    }

}
