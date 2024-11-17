package tn.esprit.jaidene_hachemi_dev.services;

import tn.esprit.jaidene_hachemi_dev.entities.Produit;

import java.util.List;

public interface IProduitService {
    List<Produit> findProduits();
    Produit findProduitById(Long id);
    Produit createProduit(Produit produit);
    Produit updateProduit(Produit produit,Long id);
    void deleteProduit(Long id);
}
