package tn.esprit.jaidene_hachemi_dev.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.jaidene_hachemi_dev.entities.Commande;
import tn.esprit.jaidene_hachemi_dev.repositories.CommandeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CommandeServiceImpl implements ICommandeService {

    private CommandeRepository commandeRepository;

    @Override
    public List<Commande> getCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande getCommandeById(Long id) {
        return commandeRepository.findById(id).get();
    }

    @Override
    public Commande createCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Commande updateCommande(Commande commande, Long id) {
        if(commandeRepository.existsById(id)) {
            return commandeRepository.save(commande);
        }
        return null;
    }

    @Override
    public void deleteCommande(Long id) {
        commandeRepository.deleteById(id);
    }
}
