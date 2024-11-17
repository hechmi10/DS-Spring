package tn.esprit.jaidene_hachemi_dev.entities;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;

    private Date dateCommande;

    private double montantTotal;

    @OneToOne
    private Paiement paiement;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Produit> Produits;

    @ManyToOne
    private Client client;
}
