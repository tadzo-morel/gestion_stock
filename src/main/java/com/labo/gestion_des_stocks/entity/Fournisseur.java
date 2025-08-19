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
public class Fournisseur {

    @Id
    @Column(name="reference",nullable = false,length = 250)
    private String reference;

    @Column(name = "immatriculation",nullable = false)
    private String immatriculation;
    @ManyToMany
    @JoinTable(name="produitFournisseur")
    List<Produit> produits=new ArrayList<Produit>();
}
