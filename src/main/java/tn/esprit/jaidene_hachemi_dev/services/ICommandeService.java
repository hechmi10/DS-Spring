package tn.esprit.jaidene_hachemi_dev.services;

import tn.esprit.jaidene_hachemi_dev.entities.Commande;

import java.util.List;

public interface ICommandeService {
    List<Commande> getCommandes();
    Commande getCommandeById(Long id);
    Commande createCommande(Commande commande);
    Commande updateCommande(Commande commande, Long id);
    void deleteCommande(Long id);
}
