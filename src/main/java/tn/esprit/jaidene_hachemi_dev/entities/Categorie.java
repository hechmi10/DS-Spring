package tn.esprit.jaidene_hachemi_dev.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Categorie {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idCategorie;

    private String nom;

    private String description;

    @OneToMany(mappedBy = "categorie")
    private Set<Produit> produits;
}
