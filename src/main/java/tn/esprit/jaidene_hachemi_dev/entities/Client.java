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
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String nom;

    private String email;

    private String telephone;

    @OneToMany(cascade=CascadeType.ALL,mappedBy = "client")
    private Set<Commande> commandes;

    @OneToOne
    private Adresse adresse;
}
