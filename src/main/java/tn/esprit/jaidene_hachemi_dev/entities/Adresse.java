package tn.esprit.jaidene_hachemi_dev.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idAdresse;

    private String ville;

    private int codePostal;

    private String pays;

}
