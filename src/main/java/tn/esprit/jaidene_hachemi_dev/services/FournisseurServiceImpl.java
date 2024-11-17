package tn.esprit.jaidene_hachemi_dev.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.jaidene_hachemi_dev.entities.Fournisseur;
import tn.esprit.jaidene_hachemi_dev.repositories.FournisseurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FournisseurServiceImpl implements IFournisseurService {

    private FournisseurRepository fournisseurRepository;

    @Override
    public List<Fournisseur> getFournisseurs() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur getFournisseurById(Long id) {
        return fournisseurRepository.findById(id).isEmpty() ? null : fournisseurRepository.findById(id).get();
    }

    @Override
    public Fournisseur createFournisseur(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur fournisseur, Long id) {
        if (fournisseurRepository.existsById(id)) {
            return fournisseurRepository.save(fournisseur);
        }
        return null;
    }

    @Override
    public void deleteFournisseurById(Long id) {
        fournisseurRepository.deleteById(id);
    }
}
