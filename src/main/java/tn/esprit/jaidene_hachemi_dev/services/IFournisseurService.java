package tn.esprit.jaidene_hachemi_dev.services;

import tn.esprit.jaidene_hachemi_dev.entities.Fournisseur;

import java.util.List;

public interface IFournisseurService {
    List<Fournisseur> getFournisseurs();
    Fournisseur getFournisseurById(Long id);
    Fournisseur createFournisseur(Fournisseur fournisseur);
    Fournisseur updateFournisseur(Fournisseur fournisseur,Long id);
    void deleteFournisseurById(Long id);
}
