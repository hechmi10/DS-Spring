package tn.esprit.jaidene_hachemi_dev.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.jaidene_hachemi_dev.entities.Produit;
import tn.esprit.jaidene_hachemi_dev.repositories.ProduitRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProduitServiceImpl implements IProduitService {

    private ProduitRepository produitRepository;

    @Override
    public List<Produit> findProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit findProduitById(Long id) {
        return produitRepository.findById(id).isPresent() ? produitRepository.findById(id).get() : null;
    }

    @Override
    public Produit createProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit updateProduit(Produit produit, Long id) {
        if (produitRepository.findById(id).isPresent()) {
            return produitRepository.save(produit);
        }
        return null;
    }

    @Override
    public void deleteProduit(Long id) {
        produitRepository.deleteById(id);
    }
}
