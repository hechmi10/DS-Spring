package tn.esprit.jaidene_hachemi_dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.jaidene_hachemi_dev.entities.Adresse;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, String> {
}
