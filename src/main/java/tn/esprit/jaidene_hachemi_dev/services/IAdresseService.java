package tn.esprit.jaidene_hachemi_dev.services;

import tn.esprit.jaidene_hachemi_dev.entities.Adresse;

import java.util.List;

public interface IAdresseService {
    List<Adresse> getAllAdresses();
    Adresse getAdresseById(String id);
    Adresse createAdresse(Adresse adresse);
    Adresse updateAdresse(Adresse adresse,String id);
    void deleteAdresse(String id);
}
