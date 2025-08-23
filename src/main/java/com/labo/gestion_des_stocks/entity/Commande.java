package com.labo.gestion_des_stocks.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_commande;

    @OneToOne(mappedBy = "commande")
    private Facture facture;
    private String numeroCommande;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @OneToMany(mappedBy = "commande",fetch = FetchType.EAGER)
    private List<ProduitCommande> commandes=new ArrayList<ProduitCommande>();


}
