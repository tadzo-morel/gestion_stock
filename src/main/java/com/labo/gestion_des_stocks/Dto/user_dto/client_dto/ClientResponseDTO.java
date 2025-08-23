package com.labo.gestion_des_stocks.Dto.user_dto.client_dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClientResponseDTO {
    private Long id;
    private String nom;
    private String email;
    private String telephone;
}
