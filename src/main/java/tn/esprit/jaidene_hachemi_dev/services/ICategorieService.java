package tn.esprit.jaidene_hachemi_dev.services;

import tn.esprit.jaidene_hachemi_dev.entities.Categorie;

import java.util.List;

public interface ICategorieService {
    List<Categorie> getCategories();
    Categorie getCategorieById(Long id);
    Categorie createCategorie(Categorie categorie);
    Categorie updateCategorie(Categorie categorie,Long id);
    void deleteCategorie(Long id);
}
