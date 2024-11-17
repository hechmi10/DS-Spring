package tn.esprit.jaidene_hachemi_dev.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.jaidene_hachemi_dev.entities.Categorie;
import tn.esprit.jaidene_hachemi_dev.repositories.CategorieRepository;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class CategorieServiceImpl implements ICategorieService{

    private CategorieRepository categorieRepository;

    @Override
    public List<Categorie> getCategories() {
        return categorieRepository.findAll();
    }

    @Override
    public Categorie getCategorieById(Long id) {
        return categorieRepository.findById(id).isPresent() ? categorieRepository.findById(id).get() : null;
    }

    @Override
    public Categorie createCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public Categorie updateCategorie(Categorie categorie, Long id) {
        if(Objects.equals(categorie.getIdCategorie(), id)) {
            return categorieRepository.save(categorie);
        }
        return null;
    }

    @Override
    public void deleteCategorie(Long id) {
        categorieRepository.deleteById(id);
    }
}
