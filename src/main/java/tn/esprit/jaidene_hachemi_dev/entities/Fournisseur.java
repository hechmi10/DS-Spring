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
public class Fournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFournisseur;

    private String nom;

    private String email;

    private String telephone;

    @ManyToMany(cascade=CascadeType.ALL)
    private Set<Produit> produits;

    @OneToOne
    private Adresse adresse;
}
