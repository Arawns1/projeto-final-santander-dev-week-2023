package me.dio.santanderdevweek2023.service;

import me.dio.santanderdevweek2023.dto.ClientDTO;
import me.dio.santanderdevweek2023.exceptions.NoSuchElementException;
import me.dio.santanderdevweek2023.model.Address;
import me.dio.santanderdevweek2023.model.Client;
import me.dio.santanderdevweek2023.repository.ClientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepository repository;

    @Autowired
    AddressService addressService;

    @Autowired
    ModelMapper modelMapper;

    public Iterable<Client> findAllClients(){
        return repository.findAll();
    }

    public Client findClientById(String id){
        Optional<Client> ClientFound = repository.findById(id);
        return ClientFound.orElseThrow(() -> new NoSuchElementException(id, "Client"));
    }

    public Client saveClient(ClientDTO clientDTO){
        Address addressFound = addressService.verifyExistenceOfAddress(clientDTO.getAddressDTO());
        Client cliente = modelMapper.map(clientDTO, Client.class);
        cliente.setAddress(addressFound);
        return repository.save(cliente);
    }

    public Client updateClient(String id, ClientDTO clientDTO){
        Optional<Client> clientFound = repository.findById(id);

        if (clientFound.isPresent()) {
            Address addressFound = addressService.verifyExistenceOfAddress(clientDTO.getAddressDTO());
            Client cliente = modelMapper.map(clientDTO, Client.class);
            cliente.setAddress(addressFound);
            return repository.save(cliente);
        } else {
            throw new NoSuchElementException("Client not found with ID: " + id);
        }
    }

    public boolean deleteClient(String id){
        repository.deleteById(id);
        Optional<Client> ClientDelete = repository.findById(id);
        return ClientDelete.isEmpty();
    }

}
