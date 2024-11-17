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
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idPaiement;

    private  double montant;

    private Date datePaiement;

    private TypePaiement typePaiement;

    @OneToOne(mappedBy = "paiement")
    private Commande commande;
}
