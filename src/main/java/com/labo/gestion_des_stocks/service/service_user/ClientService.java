package com.labo.gestion_des_stocks.service.service_user;

import com.labo.gestion_des_stocks.Dto.user_dto.client_dto.ClientRequestDTO;
import com.labo.gestion_des_stocks.Dto.user_dto.client_dto.ClientResponseDTO;
import com.labo.gestion_des_stocks.entity.Client;

import java.util.List;

public interface ClientService {
    public ClientResponseDTO getClient(Long id);
    public List<ClientResponseDTO> getAllClient();
    public ClientResponseDTO create(ClientRequestDTO clientRequestDTO);
    public String delete(Long id);
    public ClientResponseDTO updateClient(Long id,ClientRequestDTO clientRequestDTO);
}
