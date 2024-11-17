package tn.esprit.jaidene_hachemi_dev.services;

import tn.esprit.jaidene_hachemi_dev.entities.Client;

import java.util.List;

public interface IClientService {
    List<Client> getClients();
    Client getClientById(Long id);
    Client createClient(Client client);
    Client updateClient(Client client,Long id);
    void deleteClient(Long id);

}
