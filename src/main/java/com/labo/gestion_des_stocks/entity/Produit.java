package com.labo.gestion_des_stocks.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_produit;

    @Column(name="nom",length = 30)
    private String nom;

    @Column(name="designation",length = 50)
    private String designation;

    @Column(name="quantiteStock",length = 250)
    private int quantiteStock;

    @Column(name = "prix",length = 250)
    private float prix;

    @ManyToMany(mappedBy = "produits",fetch = FetchType.LAZY)
    private List<Fournisseur> fournisseurs =new ArrayList<Fournisseur>();

    @ManyToOne
    @JoinColumn(name = "id_categorie")
    private Categorie categorie;

}
