package com.labo.gestion_des_stocks.controller.controller_user;

import com.labo.gestion_des_stocks.Dto.user_dto.client_dto.ClientRequestDTO;
import com.labo.gestion_des_stocks.Dto.user_dto.client_dto.ClientResponseDTO;
import com.labo.gestion_des_stocks.service.service_user.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientService;

    @PostMapping("/create")
    public ClientResponseDTO create(@RequestBody ClientRequestDTO client){
        return clientService.create(client);
    }
    @PutMapping("/{id}")
    public ClientResponseDTO updateUser(@PathVariable Long id,@RequestBody ClientRequestDTO client){
        return clientService.updateClient(id,client);
    }
    @GetMapping("/{id}")
    public ClientResponseDTO getClient(@PathVariable Long id){
        return clientService.getClient(id);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return clientService.delete(id);
    }
    @GetMapping("/")
    public List<ClientResponseDTO> getAllClient(){
        return clientService.getAllClient();
    }
}
