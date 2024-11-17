package tn.esprit.jaidene_hachemi_dev.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;

    private String nom;

    private String description;

    private Double prix;

    private int quantiteEnStock;

    @OneToOne
    private Stock stock;

    @ManyToOne
    private Categorie categorie;

    @ManyToMany(mappedBy="produits")
    private Set<Fournisseur> fournisseurs;
}
