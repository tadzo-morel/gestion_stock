package com.labo.gestion_des_stocks.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class ProduitCommande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_produit_commande;
    private Long quatite_commande;
    private String date;
    private String Heure;
    @ManyToOne
    @JoinColumn(name = "id_produit")
    private Produit produit;
    @ManyToOne
    @JoinColumn(name = "id_commande")
    private Commande commande;

}
