package com.example.Backend.Dto;

import java.util.Date;

import com.example.Backend.Models.Administrateur;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class AdministrateurDto extends UserBaseDto {
	
	private Date datederecrutement;
    public static Administrateur toEntity(AdministrateurDto request)
    {
        return Administrateur.builder()
                .id(request.getId())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(request.getPassword())
                .adress(request.getAdress())
                .phone(request.getPhone())
                .datederecrutement(request.getDatederecrutement())
                .build();
    }
    public static AdministrateurDto toDTO(Administrateur request)
    {
        return AdministrateurDto.builder()
                .id(request.getId())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(request.getPassword())
                .adress(request.getAdress())
                .phone(request.getPhone())
                .datederecrutement(request.getDatederecrutement())
                .build();
    }

}
