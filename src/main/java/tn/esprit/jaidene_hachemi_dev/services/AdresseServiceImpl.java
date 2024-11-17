package tn.esprit.jaidene_hachemi_dev.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.jaidene_hachemi_dev.entities.Adresse;
import tn.esprit.jaidene_hachemi_dev.repositories.AdresseRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AdresseServiceImpl implements IAdresseService {

    private AdresseRepository adresseRepository;

    @Override
    public List<Adresse> getAllAdresses() {
        return adresseRepository.findAll();
    }

    @Override
    public Adresse getAdresseById(String id) {
        return adresseRepository.findById(id).isPresent() ? adresseRepository.findById(id).get() : null;
    }

    @Override
    public Adresse createAdresse(Adresse adresse) {
        return adresseRepository.save(adresse);
    }

    @Override
    public Adresse updateAdresse(Adresse adresse, String id) {
        if(adresse.getIdAdresse().equals(id)) {
            return adresseRepository.save(adresse);
        }
        return null;
    }

    @Override
    public void deleteAdresse(String id) {
        adresseRepository.deleteById(id);
    }
}
