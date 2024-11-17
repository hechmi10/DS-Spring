package tn.esprit.jaidene_hachemi_dev.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;

    private Date dateDerniereMiseAJour;

    @OneToOne(mappedBy="stock")
    private Produit produit;

}
