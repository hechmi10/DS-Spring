package tn.esprit.jaidene_hachemi_dev.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.jaidene_hachemi_dev.entities.Paiement;
import tn.esprit.jaidene_hachemi_dev.repositories.PaiementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementServiceImpl implements IPaiementService {

    private PaiementRepository paiementRepository;

    @Override
    public List<Paiement> getPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement getPaiementById(Long id) {
        return paiementRepository.findById(id).isPresent() ? paiementRepository.findById(id).get() : null;
    }

    @Override
    public Paiement createPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement updatePaiement(Paiement paiement, Long id) {
        if(paiementRepository.findById(id).isPresent()) {
            return paiementRepository.save(paiement);
        }
        return null;
    }

    @Override
    public void deletePaiement(Long id) {
        paiementRepository.deleteById(id);
    }
}
