package me.dio.santanderdevweek2023.controller;

import me.dio.santanderdevweek2023.dto.ClientDTO;
import me.dio.santanderdevweek2023.model.Client;
import me.dio.santanderdevweek2023.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    ClientService service;

    @GetMapping
    public ResponseEntity<Iterable<Client>> findAllClients(){
        return ResponseEntity.ok(service.findAllClients());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> findAllClients(@PathVariable("id") String id){
        return ResponseEntity.ok(service.findClientById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable("id") String id, @RequestBody ClientDTO client){
        service.updateClient(id, client);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @PostMapping
    public ResponseEntity<Client> saveClient( @RequestBody ClientDTO client){
        service.saveClient(client);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClientById(@PathVariable("id") String id){
        boolean isClientDeleted = service.deleteClient(id);
        return ResponseEntity.status(isClientDeleted ? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND).build();
    }

}
