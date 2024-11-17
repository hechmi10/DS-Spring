package tn.esprit.jaidene_hachemi_dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.jaidene_hachemi_dev.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
