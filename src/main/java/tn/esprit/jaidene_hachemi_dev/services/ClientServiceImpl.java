package tn.esprit.jaidene_hachemi_dev.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.jaidene_hachemi_dev.entities.Client;
import tn.esprit.jaidene_hachemi_dev.repositories.ClientRepository;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements IClientService {

    private ClientRepository clientRepository;

    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).isEmpty() ? null : clientRepository.findById(id).get();
    }

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client, Long id) {
        if (Objects.equals(client.getIdClient(), id)) {
            return clientRepository.save(client);
        }
        return null;
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
