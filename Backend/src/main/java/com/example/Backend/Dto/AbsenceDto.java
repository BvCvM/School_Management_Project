package com.example.Backend.Dto;

import java.util.Date;

import com.example.Backend.Models.Absence;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AbsenceDto {
	 private Long id;
	    private Date date;
	    private String matiere;
	    private Long professeurId;
	    private Long eleveID;


	    public static Absence toEntity(AbsenceDto request)
	    {
	        return Absence.builder()
	                .id(request.getId())
	                .date(request.getDate())
	                .matiere(request.getMatiere())
	                .build();

	    }
	    public static AbsenceDto toDTO(Absence request)
	    {
	        return AbsenceDto.builder()
	                .id(request.getId())
	                .date(request.getDate())
	                .matiere(request.getMatiere())
	                .build();

	    }

}
