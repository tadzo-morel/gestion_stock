package com.labo.gestion_des_stocks.service.service_user;

import com.labo.gestion_des_stocks.Dto.user_dto.client_dto.ClientRequestDTO;
import com.labo.gestion_des_stocks.Dto.user_dto.client_dto.ClientResponseDTO;
import com.labo.gestion_des_stocks.entity.Client;
import com.labo.gestion_des_stocks.entity.User;
import com.labo.gestion_des_stocks.repository.repository_user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class ClientServiceImpl implements ClientService{
    private final UserRepository userRepository;

    @Override
    public ClientResponseDTO getClient(Long id) {
        Client client = (Client) userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client non trouvé avec l'id : " + id));

        ClientResponseDTO clientDTO = new ClientResponseDTO(
                client.getId(),
                client.getNom(),
                client.getEmail(),
                client.getTelephone()
        );

        return clientDTO;
    }
    @Override
    public List<ClientResponseDTO> getAllClient() {
        List<ClientResponseDTO>clientResponseDTOS=new ArrayList<>();
        List<User>users=userRepository.findAll();

        for (User user: users){
            if (user instanceof Client){
                clientResponseDTOS.add(new ClientResponseDTO(
                   user.getId(),
                   user.getNom(),
                        user.getEmail(),
                        user.getTelephone()
                ));
            }
        }
        return clientResponseDTOS;
    }

    @Override
    public ClientResponseDTO create(ClientRequestDTO clientRequestDTO) {
        Client client=new Client();
        client.setNom(clientRequestDTO.getNom());
        client.setEmail(clientRequestDTO.getEmail());
        client.setTelephone(clientRequestDTO.getTelephone());
        client.setMatricule(clientRequestDTO.getMatricule());
        client.setPassword(clientRequestDTO.getPassword());
        User user= userRepository.save(client);
        ClientResponseDTO clientResponseDTO=new ClientResponseDTO(
                user.getId(),
                user.getNom(),
                user.getEmail(),
                user.getTelephone()
        );
        return clientResponseDTO;
    }

    @Override
    public String delete(Long id) {
        userRepository.deleteById(id);
        return "Client supprimer";
    }

    @Override
    public ClientResponseDTO updateClient(Long id, ClientRequestDTO clientRequestDTO) {

        Client clientToUpdate = (Client) userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found with id: " + id));

        clientToUpdate.setNom(clientRequestDTO.getNom());
        clientToUpdate.setEmail(clientRequestDTO.getEmail());
        clientToUpdate.setTelephone(clientRequestDTO.getTelephone());
        clientToUpdate.setMatricule(clientRequestDTO.getMatricule());
        User updatedUser = userRepository.save(clientToUpdate);

        return new ClientResponseDTO(
                updatedUser.getId(),
                updatedUser.getNom(),
                updatedUser.getEmail(),
                updatedUser.getTelephone()
        );
    }
}
