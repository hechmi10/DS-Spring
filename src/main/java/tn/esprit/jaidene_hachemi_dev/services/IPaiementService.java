package tn.esprit.jaidene_hachemi_dev.services;

import tn.esprit.jaidene_hachemi_dev.entities.Paiement;

import java.util.List;

public interface IPaiementService {
    List<Paiement> getPaiements();
    Paiement getPaiementById(Long id);
    Paiement createPaiement(Paiement paiement);
    Paiement updatePaiement(Paiement paiement,Long id);
    void deletePaiement(Long id);
}
